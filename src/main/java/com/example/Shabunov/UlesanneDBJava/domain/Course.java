package com.example.Shabunov.UlesanneDBJava.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String title;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public Course(){

    }

    public Course(Long id, String title, User user) {
        this.id = id;
        this.title = title;
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

    public User getUser(){
        return user;
    }

    public void setUsers(User user){
        this.user = user;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Course: #");
        sb.append(id);
        sb.append(", Title: ");
        sb.append(title);
        sb.append(", Users: ");
        sb.append(user.toString());
        return sb.toString(); 
    }
}