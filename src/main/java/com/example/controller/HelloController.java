package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String basicHello(){
        return "Hello World!";
    }

    @GetMapping("/docker")
    public String sayHello(){
        return "Hello World! from Docker Application";
    }
}
