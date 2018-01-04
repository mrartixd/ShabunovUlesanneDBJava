package com.example.Shabunov.UlesanneDBJava.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String title;
    private String code;
    


    @JoinTable(
        name = "CoursesUsers"
    )
    @ManyToMany(cascade=CascadeType.ALL)
    private Set<User> user;
    public Course(){

    }

    public Course(Long id, String title, String code , Set<User> user) {
        this.id = id;
        this.title = title;
        this.code = code;
        this.user = user;
    }

    public Long getID(){
        return id;
    }

    public void setID(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public Set<User> getUser(){
        return user;
    }

    public void setUsers(Set<User> user){
        this.user = user;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Course: #");
        sb.append(id);
        sb.append(", Title: ");
        sb.append(title);
        sb.append(", Code: ");
        sb.append(code);
        sb.append(", Users: ");
        sb.append(user.toString());
        return sb.toString(); 
    }
}