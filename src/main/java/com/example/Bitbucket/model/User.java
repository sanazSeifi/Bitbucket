package com.example.Bitbucket.model;

import java.text.NumberFormat;

public class User {
    private String name;
    private String address;
    private String age;

    public User(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public User(String name, String address, int age) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
