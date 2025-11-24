package com.example.studentRaytings.controllers;


import com.example.studentRaytings.models.Student;
import com.example.studentRaytings.models.StudentScore;
import com.example.studentRaytings.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller  // @RestController DEYİL!
public class StudentViewController {

    private static final Logger log = LoggerFactory.getLogger(StudentViewController.class);

    @Autowired
    private StudentService studentService;

    @GetMapping("/student-profile.html")
    public String viewStudentProfile(@RequestParam("id") Long studentId, Model model) {
        // get both Student and StudentScore and add to model so template can access profile + scores
        Student studentProfile = studentService.getStudentById(studentId);
        StudentScore studentScore = studentService.getStudentScoreById(studentId);

        if (studentProfile != null) {
            model.addAttribute("student", studentProfile);
            model.addAttribute("score", studentScore);
            log.debug("/student-profile.html -> student class={}, score class={}",
                    studentProfile != null ? studentProfile.getClass().getName() : "null",
                    studentScore != null ? studentScore.getClass().getName() : "null");
            return "student-profile"; // → templates/student-profile.html
        } else {
            return "redirect:/error.html"; // or a 404 page
        }
    }

    @GetMapping("/ranking.html")
    public String viewRanking(Model model) {
        model.addAttribute("students", studentService.getStudentRanking());
        return "ranking"; // → templates/ranking.html
    }

    @GetMapping("/")
    public String home() {
        return "index"; // ana səhifə
    }


    @GetMapping("/student-profile")
    public String showProfile(@RequestParam Long id, Model model) {
        // 1. Profil məlumatlarını al
        Student studentProfile = studentService.getStudentById(id);

        // 2. Eyni tələbənin bal məlumatlarını al (varsa)
        StudentScore studentScore = studentService.getStudentScoreById(id);

        // 3. Hər ikisini model-ə əlavə et
        model.addAttribute("student", studentProfile);
        model.addAttribute("score", studentScore);
        log.debug("/student-profile -> student class={}, score class={}",
            studentProfile != null ? studentProfile.getClass().getName() : "null",
            studentScore != null ? studentScore.getClass().getName() : "null");

        return "student-profile";
    }
}
