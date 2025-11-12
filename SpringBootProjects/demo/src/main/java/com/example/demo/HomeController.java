package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        List<String> students = new ArrayList<>(List.of("Vusal", "Ayxan", "Emin", "Orxan"));
        students.add("Kamran");
        model.addAttribute("students", students);
        return "index"; // 🔥 Do not use "index.html"
    }

    @GetMapping("/about")
    public String about(Model model) {
        String name = "Emin Mammadov";
        String description = "I am a beginner Java and Spring Boot developer learning web programming.";
        model.addAttribute("name", name);
        model.addAttribute("description", description);
        return "about"; // this will load about.html
    }
}
