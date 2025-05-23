package com.example.greetingsapp.service;

import org.springframework.stereotype.Service;

import com.example.greetingsapp.dto.UserDTO;
import com.example.greetingsapp.dto.GreetingResponse;

@Service
public class GreetingService {

    public GreetingResponse getGreeting() {
        return new GreetingResponse("Hello World");
    }

    public GreetingResponse getGreetingByQuery(String name) {
        return new GreetingResponse("Hello " + name + " from BridgeLabz");
    }

    public GreetingResponse getGreetingByPath(String name) {
        return new GreetingResponse("Hello " + name + " from BridgeLabz");
    }

    public GreetingResponse getGreetingByPost(UserDTO user) {
        return new GreetingResponse("Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz");
    }

    public GreetingResponse getGreetingByPut(String firstName, String lastName) {
        return new GreetingResponse("Hello " + firstName + " " + lastName + " from BridgeLabz");
    }
}
