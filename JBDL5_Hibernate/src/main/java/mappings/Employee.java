package mappings;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Employee {
    @Id
    int id;
    String name;
    String email;
    @OneToMany(mappedBy = "employee")
    List<Laptop> laptopList;

    public Employee(int id, String name, String email, List<Laptop> laptopList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.laptopList = laptopList;
    }

    public List<Laptop> getLaptopList() {
        return laptopList;
    }

    public void setLaptopList(List<Laptop> laptopList) {
        this.laptopList = laptopList;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
