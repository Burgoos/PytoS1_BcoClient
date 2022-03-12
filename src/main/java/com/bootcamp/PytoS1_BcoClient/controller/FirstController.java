package com.bootcamp.PytoS1_BcoClient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class FirstController {
    @GetMapping
    String hello(){
        return "Hello world";
    }
}
