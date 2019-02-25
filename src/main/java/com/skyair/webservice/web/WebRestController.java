package com.skyair.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}