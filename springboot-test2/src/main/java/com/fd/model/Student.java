package com.fd.model;

/**
 * @author ：zxq
 * @date ：Created in 2019/9/9 15:33
 */

public class Student {
    private Integer id;
    private String userName;
    private String gender;

    public Student() {
    }

    public Student(Integer id, String userName, String gender) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
