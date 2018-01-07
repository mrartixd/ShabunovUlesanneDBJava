package com.example.Shabunov.UlesanneDBJava.repository;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
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

    // @Transactional
    // public int insertNewCourse(long id, String title, String code){
    //     return courseRepository.setNewCourse(title, id, code);
    // }
    
    @Modifying
    @Transactional
    public void saveUserToCourse(Long userId, Long courseId) {
        if (courseId != null && userId != null) {
            courseRepository.setCourseUser(courseId, userId);
        }
    }
}
