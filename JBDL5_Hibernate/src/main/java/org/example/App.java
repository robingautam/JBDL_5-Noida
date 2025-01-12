package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
       // Student student = new Student(1,"Robin", "robin@gmail.com");
       // Student student2 = new Student(2,"preeti", "sagar@gmail.com");

        session.getTransaction().begin();
        Student student = new Student();
        student.setName("Robin");
        student.setEmail("robin@gmail.com");
        session.save(student);
      //  int a = 10/0; to throw exception
        //session.save(student2);
        session.getTransaction().commit();

        System.out.println("Data inserted in database");

       /* session.getTransaction().begin();
        session.delete(student);
        session.getTransaction().commit();*/

     /*   session.getTransaction().begin();
      Student updatedStudent =  session.get(Student.class,2);
      updatedStudent.setName("Preeti");
        session.save(updatedStudent);
        session.getTransaction().commit();*/
        session.get(Student.class,1); // fire query
        session.get(Student.class,1); // query will not fire, data will be returned form cache


      //  System.out.println(lstu);
    }
}
