package com.example.quiz;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
import java.util.Map;


@Controller
public class QuizController {


    @GetMapping("/")
    public String index(Model model) {
// Medium difficulty sample questions
        List<Map<String, Object>> questions = List.of(
                Map.of(
                        "id", 1,
                        "text", "Which data structure uses LIFO (last-in, first-out)?",
                        "choices", List.of("Queue", "Stack", "Heap", "Graph")),
                Map.of(
                        "id", 2,
                        "text", "What is the time complexity of binary search on a sorted array of n elements?",
                        "choices", List.of("O(n)", "O(log n)", "O(n log n)", "O(1)")),
                Map.of(
                        "id", 3,
                        "text", "Which keyword in Java creates a new thread by providing a runnable?",
                        "choices", List.of("synchronized", "implements", "extends", "new Thread()")),
                Map.of(
                        "id", 4,
                        "text", "Which SQL clause is used to filter results after aggregation (e.g., after GROUP BY)?",
                        "choices", List.of("WHERE", "HAVING", "ORDER BY", "LIMIT")),
                Map.of(
                        "id", 5,
                        "text", "In object-oriented programming, which principle describes hiding internal state and requiring all interaction to be performed through an object's methods?",
                        "choices", List.of("Inheritance", "Polymorphism", "Encapsulation", "Abstraction"))
        );


        model.addAttribute("questions", questions);
        return "index"; // Thymeleaf template
    }
}