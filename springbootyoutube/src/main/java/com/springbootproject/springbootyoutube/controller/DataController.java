package com.springbootproject.springbootyoutube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/controller")
    public String returnControllerpage(){
        return "Hi this is my first controller that conects the front ends";
    }

    // this is the post methos so request body is added
    @PostMapping("/controller")
    public String postMethod(@RequestBody String name){
        return "This is the post value"+"the posted value is"+name;
    }

}
