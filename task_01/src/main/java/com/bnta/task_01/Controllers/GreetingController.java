package com.bnta.task_01.Controllers;

import com.bnta.task_01.Models.Celebration;
import com.bnta.task_01.Models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

//    Step 1: return a string
//    @GetMapping
//    public String greeting(){
//        return "Good evening Ryan!";
//    }

////    Step 2: return a POJO
//    @GetMapping
//    public Greeting greeting(String name, String timeOfDay){
//        return new Greeting("Ryan", "Good evening");
//    }

//    Extension
//    Step 1: Add @RequestParam to timeOfDay
    @GetMapping
    public Greeting greeting(String name, @RequestParam String timeOfDay){
        return new Greeting("Ryan", timeOfDay);
    }

//    Step 2: Add Celebration DTO
    @GetMapping(value = "/christmas")
    public Celebration seasonalGreeting(String message){
        return new Celebration("Merry christmas!");
    }
}
