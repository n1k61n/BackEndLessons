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
    public String viewStudentProfile(@RequestParam("id") String studentIdParam, Model model) {
        // Accept the raw id string so that UI visits like ?id=undefined do not cause a hard 400.
        // We attempt to parse a Long; if parsing fails, we render the template with no student so the
        // Thymeleaf view shows the "Telebə tapılmadı" message. This provides a friendlier UX
        // for malformed client-side redirects (e.g., id=undefined).
        Long studentId = null;
        try {
            if (studentIdParam != null) {
                studentId = Long.parseLong(studentIdParam);
            }
        } catch (NumberFormatException ex) {
            // leave studentId as null
        }

        Student studentProfile = null;
        StudentScore studentScore = null;
        if (studentId != null) {
            studentProfile = studentService.getStudentById(studentId);
            // Use the safe Optional-based lookup so missing scores don't cause a RuntimeException
            studentScore = studentService.findStudentScoreByStudentId(studentId).orElse(null);
        }

        model.addAttribute("student", studentProfile);
        model.addAttribute("score", studentScore);
        log.debug("/student-profile.html -> student class={}, score class= {}",
                studentProfile != null ? studentProfile.getClass().getName() : "null",
                studentScore != null ? studentScore.getClass().getName() : "null");

        return "student-profile"; // render view that will show friendly message if student==null
    }

    @GetMapping("/ranking.html")
    public String viewRanking(Model model) {
        model.addAttribute("students", studentService.getStudentRanking());
        return "ranking"; // → templates/ranking.html
    }

    @GetMapping("/exam.html")
    public String viewExam(@RequestParam(value = "id", required = false) String id, Model model) {
        // Legacy route: map /exam.html to the existing quiz view. If an id is provided
        // forward it via the model so client-side JS can pick it up if needed.
        if (id != null) {
            model.addAttribute("examId", id);
        }
        return "quiz"; // templates/quiz.html
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
        StudentScore studentScore = studentService.findStudentScoreByStudentId(id).orElse(null);

        // 3. Hər ikisini model-ə əlavə et
        model.addAttribute("student", studentProfile);
        model.addAttribute("score", studentScore);
        log.debug("/student-profile -> student class={}, score class={}",
            studentProfile != null ? studentProfile.getClass().getName() : "null",
            studentScore != null ? studentScore.getClass().getName() : "null");

        return "student-profile";
    }
}
