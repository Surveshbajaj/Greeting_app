package com.greeting_app.greeting_app.controller;

import com.greeting_app.greeting_app.DTO.GreetingDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingAppController {
    @GetMapping
    public GreetingDTO greeting(){
        return new GreetingDTO("Hello, this is a GET request!");
    }
    @PostMapping
    public GreetingDTO greeting2(){
        return new GreetingDTO("Hello, this is a POST request!");
    }
    @PutMapping
    public GreetingDTO greeting3(){
        return new GreetingDTO("Hello, this is a PUT request!");
    }
    @DeleteMapping
    public GreetingDTO greeting4(){
        return new GreetingDTO("Hello, this is a DELETE request!");
    }

}
