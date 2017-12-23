package com.example.Shabunov.UlesanneDBJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.Shabunov.UlesanneDBJava.controller", "com.example.Shabunov.UlesanneDBJava.domain", "com.example.Shabunov.UlesanneDBJava.repository", "com.example.Shabunov.UlesanneDBJava"})
public class UlesanneDbJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UlesanneDbJavaApplication.class, args);

		
	}

}
