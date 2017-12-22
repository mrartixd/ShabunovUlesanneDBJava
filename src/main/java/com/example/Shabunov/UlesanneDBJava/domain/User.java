package com.example.Shabunov.UlesanneDBJava.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;
    @OneToMany(mappedBy = "user")
    private List<Course> courses;


    public User(){

    }

    public User(long id, String firstname, String lastname, List<Course> courses ){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.courses = courses;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
    
    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }
    
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public List<Course> getCourse(){
        return courses;
    }

    public void setCourse (List<Course> courses){
        this.courses = courses;
    }
}