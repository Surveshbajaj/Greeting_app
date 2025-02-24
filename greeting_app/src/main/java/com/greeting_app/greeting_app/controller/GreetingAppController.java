package com.greeting_app.greeting_app.controller;

import com.greeting_app.greeting_app.DTO.GreetingDTO;
import com.greeting_app.greeting_app.DTO.GreetingRequest;
import com.greeting_app.greeting_app.Services.GreetingService;
import com.greeting_app.greeting_app.entity.GreetingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingAppController {
    @Autowired
    private final GreetingService greetingService;


    public GreetingAppController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    //UC-05
    @GetMapping("/{id}")
    public String greeting(@PathVariable long id){
        return (greetingService.getMessageById(id)).getMessage();
    }

    //UC-06
    @GetMapping("/all")
    public List<GreetingEntity> getAllMessages() {
        return greetingService.getAllMessage();
    }
    @PostMapping
    public GreetingDTO greeting2(@RequestBody GreetingRequest greetingRequest) {
        return new GreetingDTO("Hello "+ greetingRequest.getFirstName() + " " + greetingRequest.getLastName());
    }
    //UC-04
    @PostMapping("/add")
    public GreetingEntity greeting5(@RequestBody GreetingDTO greetingDTO){
        return greetingService.saveGreeting(greetingDTO.getMessage());
    }

    @PutMapping
    public GreetingDTO greeting3() {
        return new GreetingDTO("Hello, this is a PUT request!");
    }

    @DeleteMapping
    public GreetingDTO greeting4() {
        return new GreetingDTO("Hello, this is a DELETE request!");
    }



}
