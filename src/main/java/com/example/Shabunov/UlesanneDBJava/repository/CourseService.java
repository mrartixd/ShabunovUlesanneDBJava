package com.example.Shabunov.UlesanneDBJava.repository;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Shabunov.UlesanneDBJava.domain.Course;



@Service
public class CourseService{

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseByID(long id){
        return courseRepository.findOne(id);
    }

    public List<Course> getCoursesByTitle(String title){
        return courseRepository.findByTitleLikeIgnoreCase(title);
    }

    @Transactional
    public int updateCourseTitle(long id, String title){
        return courseRepository.setNewTitle(title, id);
    }
}
