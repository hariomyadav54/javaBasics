package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student1 {
private  String name;
private List<String> mobile;
private  Set<String> address;
private Map<String,String> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student1() {
    }

    public List<String> getMobile() {
        return mobile;
    }

    public void setMobile(List<String> mobile) {
        this.mobile = mobile;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }
    public Student1(String name, List<String> mobile, Set<String> address, Map<String, String> courses) {
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.courses = courses;
    }
}

