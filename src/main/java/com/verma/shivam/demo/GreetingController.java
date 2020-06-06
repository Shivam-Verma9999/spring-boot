package com.verma.shivam.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String hello(){
        return "Hello world :)";
    }

    @Loggable
    @GetMapping("/greet")
    public String greet(){
        return "In the greet mapping";
    }
}
