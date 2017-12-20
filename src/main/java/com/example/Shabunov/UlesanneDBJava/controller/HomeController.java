package com.example.Shabunov.UlesanneDBJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController{

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "<h1> Hello, Spring Boot!</h1>";
    }
}