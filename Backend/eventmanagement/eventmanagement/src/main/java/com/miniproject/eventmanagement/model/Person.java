package com.miniproject.eventmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    public String hotalname;
    public String address;
    public Integer code;
    public Person(){

    }
    public Person(String hotalname, String address, int code) {
        this.hotalname = hotalname;
        this.address = address;
        this.code = code;
    }
    public String getHotalname() {
        return hotalname;
    }
    public void setHotalname(String hotalname) {
        this.hotalname = hotalname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }


}