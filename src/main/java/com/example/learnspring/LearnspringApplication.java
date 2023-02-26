package com.example.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.learnspring.controllers")
public class LearnspringApplication {

    public static void main(String[] args) {

        SpringApplication.run(LearnspringApplication.class, args);
    }
}
