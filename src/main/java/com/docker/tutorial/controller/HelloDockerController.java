package com.docker.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

    @GetMapping("/helloDocker")
    public String sayHello(){
        return "Hello Docker";
    }
}
