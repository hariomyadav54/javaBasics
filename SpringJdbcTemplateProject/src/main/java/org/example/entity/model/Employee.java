package org.example.entity.model;

public class Employee {
    private int id;
    private String name;
    private String lastname;
    private String address;
    private long mobileNo;

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
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public long getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "id :" + id +
                ", name :'" + name + '\'' +
                ", lastname :'" + lastname + '\'' +
                ", address :'" + address + '\'' +
                ", mobileNo :" + mobileNo ;
    }
}
