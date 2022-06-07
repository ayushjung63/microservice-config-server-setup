package com.ayush.clientservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.env}")
    private String env;

    @RequestMapping("/show")
    public ResponseEntity show(){
        return new ResponseEntity("Environment from Config Server: "+env, HttpStatus.OK);
    }
}
