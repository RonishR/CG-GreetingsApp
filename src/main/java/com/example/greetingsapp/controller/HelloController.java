package com.example.greetingsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.greetingsapp.dto.UserDTO;
import com.example.greetingsapp.dto.GreetingResponse;
import com.example.greetingsapp.service.GreetingService;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public GreetingResponse sayHello() {
        return greetingService.getGreeting();
    }

    @GetMapping("/query")
    public GreetingResponse sayHelloQuery(@RequestParam String name) {
        return greetingService.getGreetingByQuery(name);
    }

    @GetMapping("/param/{name}")
    public GreetingResponse sayHelloPath(@PathVariable String name) {
        return greetingService.getGreetingByPath(name);
    }

    @PostMapping("/post")
    public GreetingResponse sayHelloPost(@RequestBody UserDTO user) {
        return greetingService.getGreetingByPost(user);
    }

    @PutMapping("/put/{firstName}")
    public GreetingResponse sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return greetingService.getGreetingByPut(firstName, lastName);
    }
    
    @PostMapping("/personal")
    public GreetingResponse getFlexibleGreeting(@RequestBody UserDTO user) {
        return greetingService.getPersonalizedGreeting(user);
    }
}
