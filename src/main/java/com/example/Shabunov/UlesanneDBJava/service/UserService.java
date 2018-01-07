package com.example.Shabunov.UlesanneDBJava.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.Shabunov.UlesanneDBJava.domain.User;
import com.example.Shabunov.UlesanneDBJava.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
    
}
