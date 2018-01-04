package com.example.Shabunov.UlesanneDBJava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Shabunov.UlesanneDBJava.domain.User;

public interface StudentRepository extends JpaRepository<User, Long> {
@Query(value="SELECT User.* FROM User, COURSES_USERS, Course WHERE User.id=COURSES_USERS.user_id"+
    " AND COURSES_USERS.courses_id = Course.id AND Course.id=?1", nativeQuery= true)
    List<User> findUserByCourseID(long id);
}