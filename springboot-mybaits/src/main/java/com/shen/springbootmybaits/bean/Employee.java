package com.shen.springbootmybaits.bean;

public class Employee {

    private Integer id;
    private String IastName;
    private Integer gender;
    private String  email;
    private Integer dId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIastName() {
        return IastName;
    }

    public void setIastName(String iastName) {
        IastName = iastName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}
