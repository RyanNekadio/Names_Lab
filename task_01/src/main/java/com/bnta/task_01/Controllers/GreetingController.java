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
public class GreetingController {

    @GetMapping(value = "/greeting")
    public String newGreeting(@RequestParam String timeOfDay){
        Greeting greeting = new Greeting("Ryan");
        return timeOfDay + " " +  greeting.getName() + "!";
    }

    @GetMapping(value = "/greeting/christmas")
    public String newCelebration(){
        Celebration christmas = new Celebration("Merry Christmas!");
        return christmas.getMessage();
    }
}
