package com.apigateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {


    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        return " User Servce is down at this time";
    }

    @GetMapping("/contactServiceFallback")
    public String contactServiceFallback(){
        return " Contact Service is down at this time";
    }
}
