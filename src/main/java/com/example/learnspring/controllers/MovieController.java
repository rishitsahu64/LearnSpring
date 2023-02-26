package com.example.learnspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class MovieController {
    @GetMapping
    public String getMovies() {
        return "found Movies";
    }
}
