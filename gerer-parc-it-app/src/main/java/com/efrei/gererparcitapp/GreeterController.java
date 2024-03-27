package com.efrei.gererparcitapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @GetMapping("/hello")
    public String sayHello() {
        String nom = "yanis";
        return "Hello " + nom + "!";
    }
}

