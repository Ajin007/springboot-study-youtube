package com.springbootproject.springbootyoutube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/controller")
    public String returnControllerpage(){
        return "Hi this is my first controller that conects the front ends";
    }

}
