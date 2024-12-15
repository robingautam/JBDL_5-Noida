package org.gfg.service;

import org.gfg.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    static List<Student> studentList = new ArrayList<>();

   static {
       Student student = new Student(1,"Robin","robin@gmail.com");
       Student student2 = new Student(2,"Aakash","aakash@gmail.com");
       Student student3 = new Student(3,"Preeti","preeti@gmail.com");

      studentList = Arrays.asList(student2,student,student3);
   }

    public List<Student> getStudents(){


        return studentList;
    }

    public Student getStudentById(int id){
        for (Student st: studentList){
            if (st.getId()==id){
                return st;
            }
        }

        return null;
    }
}
