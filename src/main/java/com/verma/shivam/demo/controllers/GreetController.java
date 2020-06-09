package com.verma.shivam.demo.controllers;


import com.verma.shivam.demo.model.User;
import com.verma.shivam.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetController {

    private final UserService userService;

    @Autowired
    public GreetController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(){
        return "Welcome to my api.";
    }

    @PostMapping("/register")
    public User registeredUser(@RequestBody User user){

        return userService.registerUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") String id){
        return userService.getUser(id);
    };
}
