package org.gfg.JBDL5_SpringJPA.repository;

import org.gfg.JBDL5_SpringJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByName(String name);
    Student findByNameAndEmail(String name, String email);
    Student findByNameOrEmail(String name, String email);

    @Query("select s from student s where s.name=:name")
    Student findByNameJPQL(String name);

   // @Query("select s from student s where s.name=:name and s.email=:email")
    @Query(name = "student.findByName")
    Student findByNameAndEmailJPQL(String name, String email);

    @NativeQuery("select * from student where student.name=:name")
    Student findByNameNative(String name);

    @Query("update student s set s.name=:newname where s.name=:oldName")
    @Modifying
    @Transactional
    void updateName(String oldName, String newname);


}
