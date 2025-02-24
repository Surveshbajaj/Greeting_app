package com.greeting_app.greeting_app.DTO;

public class GreetingDTO {
    private String message;

    // Constructors
    public GreetingDTO() {}

    public GreetingDTO(String message) {

        this.message = message;
    }

    // Getters and Setters

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
