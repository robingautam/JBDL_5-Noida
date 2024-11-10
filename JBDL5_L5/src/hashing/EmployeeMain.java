package hashing;

import java.util.HashSet;
import java.util.Set;

public class EmployeeMain {

    public static void main(String[] args) {
       Employee emp1 = new Employee(1,"Robin");
       Employee emp2 = new Employee(1,"Robin");

       System.out.println(emp1.hashCode());
       System.out.println(emp2.hashCode());

      Set<Employee> set = new HashSet<>();
      set.add(emp1);
      set.add(emp2);

      System.out.println(set.size());

    }
}
