package com.humber.githubspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubSpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubSpringDemoApplication.class, args);
    }

    @GetMapping("/ping")
    public String ping(){
        return "Pong";
    }
}
