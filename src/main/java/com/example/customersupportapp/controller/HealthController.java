package com.example.customersupportapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {

    @RequestMapping("/health")
    public String status(){
        return "OK";
    }

}
