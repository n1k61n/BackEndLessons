package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Controller
public class LoginController {
    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String login, @RequestParam String password, Model model) {
        try {
            Student student = studentRepo.findByLogin(login);
            if (passwordEncoder.matches(password, student.getPasswordHash())) { 
                model.addAttribute("name", student.getFirstName());
                return "welcome";
            } else {
                model.addAttribute("error", "Invalid password");
                return "login";
            }
        } catch (Exception e) {
            model.addAttribute("error", "User not found");
            return "login";
        }
    }
}