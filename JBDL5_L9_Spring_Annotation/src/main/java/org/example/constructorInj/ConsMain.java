package org.example.constructorInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsMain {

    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("org/example/constructorInj/config.xml");

        Employee employee = context.getBean("employee", Employee.class);

        Math math = context.getBean("math", Math.class);

        System.out.println(employee);
        System.out.println(math);
    }
}
