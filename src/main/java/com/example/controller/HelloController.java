package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String basicHello(){
        return "Hello World!";
    }

    @GetMapping("/health")
    public ResponseEntity<String> checkHealth(){
        return ResponseEntity.ok("Health is ok");
    }

    @GetMapping("/docker")
    public String sayHello(){
        return "Hello World! from Docker Application";
    }
}
