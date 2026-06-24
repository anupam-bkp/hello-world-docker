package com.example.controller;

import com.example.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping
    public String basicHello(){
        log.info("Hello World");
        return "Hello World!";
    }

    @GetMapping("/health")
    public ResponseEntity<String> checkHealth(){
        log.info("Checking health. Health is OK");
        return ResponseEntity.ok("Health is ok");
    }

    @GetMapping("/docker")
    public String sayHello(){
        log.info("Hello World from Docker Application");
        return "Hello World! from Docker Application";
    }

    @PostMapping("/login")
    public ResponseEntity<User> addUser(@RequestBody User user){
        log.info("Adding user : {}", user);
        return ResponseEntity.ok(user);
    }
}
