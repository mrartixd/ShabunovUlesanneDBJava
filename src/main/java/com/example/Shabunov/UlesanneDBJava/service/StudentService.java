package com.example.Shabunov.UlesanneDBJava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Shabunov.UlesanneDBJava.domain.User;
import com.example.Shabunov.UlesanneDBJava.repository.StudentRepository;

@Service
public class StudentService{

    @Autowired
    StudentRepository studentRepository;

    public List<User> getUserByCourseID(long id){
        return studentRepository.findUserByCourseID(id);
    } 
}