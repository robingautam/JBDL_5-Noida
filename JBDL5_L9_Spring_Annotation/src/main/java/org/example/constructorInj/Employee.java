package org.example.constructorInj;

public class Employee {

    int eid;
    String name;
    String email;

   Employee(int id, String name, String email){
       System.out.println("Using constructor injection");
       this.eid = id;
       this.name = name;
       this.email = email;
   }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
