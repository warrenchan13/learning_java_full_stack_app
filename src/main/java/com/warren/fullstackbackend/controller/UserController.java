package com.warren.fullstackbackend.controller;
import com.warren.fullstackbackend.model.User;
import com.warren.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // used to create RESTful web services using Spring MVC.
@CrossOrigin("http://localhost:3000") // used to share the resources from one domain to another domain.
public class UserController {
    @Autowired // allows Spring to automatically inject dependencies into the class
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
