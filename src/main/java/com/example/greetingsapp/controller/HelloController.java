package com.example.greetingsapp.controller;

import com.example.greetingsapp.dto.GreetingResponse;
import com.example.greetingsapp.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public GreetingResponse sayHello() {
        return new GreetingResponse("Hello from BridgeLabz");
    }

    @GetMapping("/query")
    public GreetingResponse sayHelloQuery(@RequestParam String name) {
        return new GreetingResponse("Hello " + name + " from BridgeLabz");
    }

    @GetMapping("/param/{name}")
    public GreetingResponse sayHelloPath(@PathVariable String name) {
        return new GreetingResponse("Hello " + name + " from BridgeLabz");
    }

    @PostMapping("/post")
    public GreetingResponse sayHelloPost(@RequestBody UserDTO user) {
        return new GreetingResponse("Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz");
    }

    @PutMapping("/put/{firstName}")
    public GreetingResponse sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return new GreetingResponse("Hello " + firstName + " " + lastName + " from BridgeLabz");
    }
}
