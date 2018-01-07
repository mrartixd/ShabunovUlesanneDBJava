package com.example.Shabunov.UlesanneDBJava.web;

import java.security.Principal;
import java.util.Set;

import com.example.Shabunov.UlesanneDBJava.domain.User;
import com.example.Shabunov.UlesanneDBJava.repository.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/course/{id}/user/register/{userid}")
    public String getRegisterUserToCourse(@PathVariable("id") Long courseId,
    @PathVariable("userid") Long userId, Model model,Principal principal) {
        courseService.saveUserToCourse(userId, courseId);
        String name = principal.getName();
		model.addAttribute("username", name);
        return "redirect:/course/" + courseId;
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

    @RequestMapping(value = "/regcourse")
    public String regCourse(Model model){
        model.addAttribute("courses", courseService.getAllCourses());
        return "regcourse";
    }

    @GetMapping("/editcourse")
    public String editCourse() {
        return "editcourse";
    }

    @GetMapping("/edituser")
    public String editUser() {
        return "edituser";
    }
}
