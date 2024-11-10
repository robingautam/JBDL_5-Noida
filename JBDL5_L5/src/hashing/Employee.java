package hashing;

public class Employee {
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        Employee employee = (Employee) obj;

        return this.id==employee.id && this.name.equals(employee.name);
    }


    @Override
    public int hashCode(){
        return this.id+this.name.hashCode();
    }

}
