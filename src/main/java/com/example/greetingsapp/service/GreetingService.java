package com.example.greetingsapp.service;

import org.springframework.stereotype.Service;
import com.example.greetingsapp.dto.GreetingResponse;
import com.example.greetingsapp.dto.UserDTO;

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

    public GreetingResponse getPersonalizedGreeting(UserDTO user) {
        String first = user.getFirstName();
        String last = user.getLastName();

        if (first != null && !first.isEmpty() && last != null && !last.isEmpty()) {
            return new GreetingResponse("Hello " + first + " " + last + " from BridgeLabz");
        } else if (first != null && !first.isEmpty()) {
            return new GreetingResponse("Hello " + first + " from BridgeLabz");
        } else if (last != null && !last.isEmpty()) {
            return new GreetingResponse("Hello " + last + " from BridgeLabz");
        } else {
            return new GreetingResponse("Hello World");
        }
    }
}