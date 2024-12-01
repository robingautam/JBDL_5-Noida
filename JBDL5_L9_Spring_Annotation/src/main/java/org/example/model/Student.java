package org.example.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.nio.IntBuffer;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student extends Parent implements InitializingBean, DisposableBean {
    int id;
    String name;
    String email;


    Address address;

    List<Integer> list;
    Set<String> subjects;

    Map<String, Integer> map;

    public int getId() {
        return id;
    }

    @Autowired
    Student(Address address){
        this.address = address;
    }

    public void setId(int id) {
        System.out.println("calling setId method");
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

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", list=" + list +
                ", subjects=" + subjects +
                ", map=" + map +
                ", commonField='" + commonField + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside the init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside the destroy method");
    }
}
