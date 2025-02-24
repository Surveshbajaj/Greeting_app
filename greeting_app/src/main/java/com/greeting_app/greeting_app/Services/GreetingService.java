package com.greeting_app.greeting_app.Services;

import com.greeting_app.greeting_app.DTO.GreetingDTO;
import com.greeting_app.greeting_app.entity.GreetingEntity;
import com.greeting_app.greeting_app.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class GreetingService {
        @Autowired
        private GreetingRepository greetingRepository;

        //Method to create and save a greetinng message
        public GreetingEntity saveGreeting(String message) {
            GreetingEntity greeting = new GreetingEntity(message);
            return greetingRepository.save(greeting);
        }
        public String getGreeting() {
            return "Hello World";
        }
    }

