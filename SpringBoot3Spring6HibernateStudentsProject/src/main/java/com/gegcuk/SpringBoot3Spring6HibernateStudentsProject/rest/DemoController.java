package com.gegcuk.SpringBoot3Spring6HibernateStudentsProject.rest;

import com.gegcuk.SpringBoot3Spring6HibernateStudentsProject.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/testpage")
    public String testmethod(){
        return "Test message from testmethod in DemoController.";
    }
}
