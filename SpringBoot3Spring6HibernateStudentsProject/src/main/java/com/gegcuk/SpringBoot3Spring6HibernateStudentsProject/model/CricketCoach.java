package com.gegcuk.SpringBoot3Spring6HibernateStudentsProject.model;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Workout from CricketCoach";
    }
}
