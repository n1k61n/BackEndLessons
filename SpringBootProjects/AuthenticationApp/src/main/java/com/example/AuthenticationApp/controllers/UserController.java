package com.example.AuthenticationApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login.html")
    String login(){
        return "login";
    }


    @GetMapping("/signup.html")
    String signup(){
        return "signup";
    }
}
