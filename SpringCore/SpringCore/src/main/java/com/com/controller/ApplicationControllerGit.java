package com.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationControllerGit {

    @GetMapping
    public String sayHello(){
        return "Welcome to github";
    }
    @GetMapping("/set")
    public String setService(){
        return "hello replay to";
    }
}
