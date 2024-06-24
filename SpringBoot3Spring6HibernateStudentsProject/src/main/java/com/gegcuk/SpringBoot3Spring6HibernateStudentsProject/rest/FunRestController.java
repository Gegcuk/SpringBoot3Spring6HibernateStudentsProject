package com.gegcuk.SpringBoot3Spring6HibernateStudentsProject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/funpage")
    public String getFunPage(){
        return "Team name: " + teamName + ", Coach Name: " + coachName;
    }
}
