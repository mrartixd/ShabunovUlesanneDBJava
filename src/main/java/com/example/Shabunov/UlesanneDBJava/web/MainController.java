package com.example.Shabunov.UlesanneDBJava.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Shabunov.UlesanneDBJava.repository.CourseService;

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
    public String getCourseByID(@PathVariable("id") short id, Model model){
        model.addAttribute("book", courseService.getCourseByID(id));
        return "courseInfo.html";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
}
