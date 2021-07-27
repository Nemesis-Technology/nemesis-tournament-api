package com.nemesisTechnology.tournamentGenerator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping(path = "/ping")
    public String smoke(){
        return "pong";
    }
}