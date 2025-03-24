package com.example.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, World!";
    }
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to my Spring Boot API!";
    }

}
