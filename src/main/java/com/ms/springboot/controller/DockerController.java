package com.ms.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {


    @GetMapping("/docker")
     public String dockerDome(){
         return "Dockerizing Spring Boot Application";
      }
}
