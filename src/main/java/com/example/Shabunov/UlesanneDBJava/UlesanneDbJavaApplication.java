package com.example.Shabunov.UlesanneDBJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.Shabunov.UlesanneDBJava.controller"})
public class UlesanneDbJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UlesanneDbJavaApplication.class, args);
	}
}
