package mappings;

import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Laptop.class);
        configuration.addAnnotatedClass(Employee.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.getTransaction().begin();


        Employee employee = new Employee(1,"Robin","robin@gmail.com", null);
        session.save(employee);

        Laptop laptop = new Laptop(1001, "DELL");
        laptop.setEmployee(employee);
        session.save(laptop);
        Laptop laptop2 = new Laptop(1002, "Macbook");
        laptop2.setEmployee(employee);
        session.save(laptop2);

        session.getTransaction().commit();

        System.out.println("Mapping done");
    }
}
