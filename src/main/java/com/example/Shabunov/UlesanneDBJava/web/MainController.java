package com.example.Shabunov.UlesanneDBJava.web;

import java.util.Set;

import com.example.Shabunov.UlesanneDBJava.domain.User;
import com.example.Shabunov.UlesanneDBJava.repository.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/")
    public String getCourses(Model model){
        model.addAttribute("courses", courseService.getAllCourses());
        return "index";
    }

    @RequestMapping(value= "/course/{id}")
    public String getCourseByID(@PathVariable("id") Long id, Model model){
        model.addAttribute("course", courseService.getCourseByID(id));
        Set<User> users=courseService.getCourseByID(id).getUser();
        model.addAttribute("students", users);
        return "courseInfo";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
    @GetMapping("/newcourse")
    public String newCourse() {
        return "newcourse";
    }

    @GetMapping("/regcourse")
    public String regCourse() {
        return "newcourse";
    }
}
