package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
       JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbctemplate", JdbcTemplate.class);

        String query = "INSERT INTO student (id, name, email) VALUES (?,?,?)";

      int rows =  jdbcTemplate.update(query,2,"Aakash","aakash@gmail.com");

        System.out.println("Rows Updated: "+rows);
    }
}
