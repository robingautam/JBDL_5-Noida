package org.example;

import org.example.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
     //   ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\Users\\Administrator\\Documents\\JBDL5\\JBDL5_L9_Spring\\src\\main\\java\\org\\example\\constructorInj\\config.xml");
        applicationContext.registerShutdownHook();
        Student student = (Student) applicationContext.getBean("stu");
        Student student2 = (Student) applicationContext.getBean("stu");
        System.out.println(student);
      //  System.out.println(student2.hashCode());
    }
}
