package com.achek.producer.controllers;

import com.achek.producer.producerService.ProducerService;
import com.achek.producer.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegUserController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/register")
    public String generate(@RequestParam String name, @RequestParam String role, @RequestParam int age) {
        producerService.produce(new User(name, role, age));
        return "OK";
    }
}
