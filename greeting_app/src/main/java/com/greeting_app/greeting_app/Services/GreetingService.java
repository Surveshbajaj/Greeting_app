package com.greeting_app.greeting_app.Services;

import com.greeting_app.greeting_app.DTO.GreetingDTO;
import org.springframework.stereotype.Service;

    @Service
    public class GreetingService {

        public String getGreeting() {
            return "Hello World";
        }
    }

