package com.example.Shabunov.UlesanneDBJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.Shabunov.UlesanneDBJava.controller", "com.example.Shabunov.UlesanneDBJava.domain", "com.example.Shabunov.UlesanneDBJava.repository" , "com.example.Shabunov.UlesanneDBJava.config","com.example.Shabunov.UlesanneDBJava.constraint","com.example.Shabunov.UlesanneDBJava.service","com.example.Shabunov.UlesanneDBJava.web","com.example.Shabunov.UlesanneDBJava.web.dto", "com.example.Shabunov.UlesanneDBJava"})
public class UlesanneDbJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UlesanneDbJavaApplication.class, args);

		
	}

}
