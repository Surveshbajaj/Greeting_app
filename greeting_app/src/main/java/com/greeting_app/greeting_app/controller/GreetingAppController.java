package com.greeting_app.greeting_app.controller;

import com.greeting_app.greeting_app.DTO.GreetingDTO;
import com.greeting_app.greeting_app.DTO.GreetingRequest;
import com.greeting_app.greeting_app.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingAppController {
    @Autowired
    private final GreetingService greetingService;

    public GreetingAppController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public GreetingDTO greeting() {
        return new GreetingDTO(greetingService.getGreeting());
    }

    @PostMapping
    public GreetingDTO greeting2(@RequestBody GreetingRequest greetingRequest) {
        return new GreetingDTO("Hello "+ greetingRequest.getFirstName() + " " + greetingRequest.getLastName());
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
