package com.bnta.task_01.Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Greeting {
    private String name;

    public Greeting (String name){
        this.name = name;
    }

    public Greeting(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getTimeOfDay() {
//        return timeOfDay;
//    }
//
//    public void setTimeOfDay(String timeOfDay) {
//        this.timeOfDay = timeOfDay;
//    }
}
