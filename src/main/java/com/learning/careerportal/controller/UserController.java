package com.learning.careerportal.controller;

import com.learning.careerportal.entity.User;
import com.learning.careerportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

@Autowired
private UserRepository userRepository;

@PostMapping("/register")
public String register(@RequestBody User user) {

    User existingUser =
            userRepository.findByUsername(user.getUsername());

    if(existingUser != null) {
        return "Username already exists";
    }

    userRepository.save(user);

    return "User Registered Successfully";
}
@PostMapping("/login")
public String login(@RequestBody User user) {

    System.out.println("Login Attempt: " + user.getUsername());

    User existingUser =
            userRepository.findByUsername(user.getUsername());

    if(existingUser == null) {
        System.out.println("User not found");
        return "FAILED";
    }

    System.out.println("Stored Username: " + existingUser.getUsername());
    System.out.println("Stored Password: " + existingUser.getPassword());

    if(existingUser.getPassword().equals(user.getPassword())) {
        return "SUCCESS";
    }

    return "FAILED";
}



}
