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
    private Users user;

    public Course(){

    }

    public Course(Long id, String title, Users user) {
        this.id = id;
        this.title = title;
        this.user = user;
    }
}