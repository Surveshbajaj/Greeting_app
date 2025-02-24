package com.greeting_app.greeting_app.controller;

import com.greeting_app.greeting_app.DTO.GreetingDTO;
import com.greeting_app.greeting_app.DTO.GreetingRequest;
import com.greeting_app.greeting_app.Services.GreetingService;
import com.greeting_app.greeting_app.entity.GreetingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    //UC-07
    //PUT API to update a greeting message
    @PutMapping("/edit/{id}")
    public GreetingEntity editGreeting(@PathVariable Long id, @RequestParam String newMessage) {
        return greetingService.updateGreeting(id, newMessage);
    }

    @PutMapping
    public GreetingDTO greeting3() {
        return new GreetingDTO("Hello, this is a PUT request!");
    }

    @DeleteMapping
    public GreetingDTO greeting4() {
        return new GreetingDTO("Hello, this is a DELETE request!");
    }

    //UC-08
    @DeleteMapping("/delete/{id}")
    public Boolean greetDelete(@PathVariable long id) {
        return greetingService.deleteGreeting(id);

    }




}
