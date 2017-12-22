package com.example.Shabunov.UlesanneDBJava.repository;

import com.example.Shabunov.UlesanneDBJava.domain.Course;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByTitle(String title);
    Course findById(long id);
    List<Course> findByTitleIgnoreCase (String title);
    List<Course> findByTitleOrderByTitleAsc (String title);


    @Query("select b from Course b where lower(b.title) like %:title%")
    List<Course> findByTitleLikeIgnoreCase(@Param("title")String title);

    @Query(nativeQuery = true, value= "SELECT Course.* FROM Course, User "+"WHERE Course.user_id=User.id AND Course.user_id=?1")
    List<Course> findCourseByUserId(long id);


    @Modifying
    @Transactional(readOnly= false)
    @Query("UPDATE Course SET title = :title WHERE id = :id")
    int setNewTitle(@Param("title") String title, @Param("id") long id);

    
}