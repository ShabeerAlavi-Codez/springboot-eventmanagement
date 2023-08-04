package com.miniproject.eventmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String password;
    public User(String name, String password, String organisation, String designation, String contact, String email) {
        this.name = name;
        this.password = password;
        Organisation = organisation;
        Designation = designation;
        Contact = contact;
        this.email = email;
    }
    private String Organisation;
    private String Designation;
    private String Contact;
    private String email;
    private String profile;
    private String Description;
    private String Rating;
    private Integer TypeId;

    public User(){}
    public User(Long id, String name, String password, String organisation, String designation, String contact,
            String email, String profile, String description, String rating, Integer typeId) {
        Id = id;
        this.name = name;
        this.password = password;
        Organisation = organisation;
        Designation = designation;
        Contact = contact;
        this.email = email;
        this.profile = profile;
        Description = description;
        Rating = rating;
        TypeId = typeId;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getOrganisation() {
        return Organisation;
    }
    public void setOrganisation(String organisation) {
        Organisation = organisation;
    }
    public String getDesignation() {
        return Designation;
    }
    public void setDesignation(String designation) {
        Designation = designation;
    }
    public String getContact() {
        return Contact;
    }
    public void setContact(String contact) {
        Contact = contact;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getProfile() {
        return profile;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public String getRating() {
        return Rating;
    }
    public void setRating(String rating) {
        Rating = rating;
    }
    public Integer getTypeId() {
        return TypeId;
    }
    public void setTypeId(Integer typeId) {
        TypeId = typeId;
    }
    
    

}