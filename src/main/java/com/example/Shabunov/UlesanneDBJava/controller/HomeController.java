package com.example.Shabunov.UlesanneDBJava.controller;


import com.example.Shabunov.UlesanneDBJava.repository.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@Repository(value="CourseRepository")
@Controller
public class HomeController{

    // @RequestMapping("/")
    // @ResponseBody
    // String home() {
    //     return "<h1> Hello, Spring Boot!</h1>";
    // }

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/")
    public String getCourses(Model model){
        model.addAttribute("courses", courseService.getAllCourses());
        return "index.html";
    }

    @RequestMapping(value= "/course/{id}")
    public String getCourseByID(@PathVariable("id") short id, Model model){
        model.addAttribute("book", courseService.getCourseByID(id));
        return "courseInfo";
    }

}