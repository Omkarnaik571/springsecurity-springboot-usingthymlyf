package com.sapiens.springboot.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sapiens.springboot.springsecurity.model.User;
import com.sapiens.springboot.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
