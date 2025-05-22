package com.example.greetingsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.greetingsapp.dto.UserDTO;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String sayhello() {
		return "Hello from BridgeLabz";
	}
	
	@GetMapping("/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
	
	@GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
	
	@PostMapping("/post")
    public String sayHelloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
	
	@PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }


}
