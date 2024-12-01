package org.example.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

       Student student = applicationContext.getBean("st45", Student.class);

        System.out.println(student);
    }
}
