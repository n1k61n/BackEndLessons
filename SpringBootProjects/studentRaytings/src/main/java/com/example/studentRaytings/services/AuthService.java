package com.example.studentRaytings.services;

import com.example.studentRaytings.models.Student;
import com.example.studentRaytings.models.StudentScore;
import com.example.studentRaytings.repositories.StudentScoreRepository;
import com.example.studentRaytings.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    // Removed unused StudentRepository injection

    @Autowired
    private StudentScoreRepository studentScoreRepository;

    public Student registerUser(Student student) {
        if (userRepository.findByEmail(student.getEmail()).isPresent()) {
            throw new RuntimeException("Bu email artıq qeydiyyatdan keçib!");
        }

        // 1. Reytinq üçün yeni 'Student' obyektini yaradırıq
        StudentScore newStudentScore = new StudentScore();
        newStudentScore.setGpaScore(0.0);
        newStudentScore.setProjectScore(0.0);
        newStudentScore.setActivityScore(0.0);
        newStudentScore.setExamScore(0.0);
        newStudentScore.setOverallScore(0.0);

        // StudentScore obyektini bazaya yazırıq
        studentScoreRepository.save(newStudentScore);



        // 3. İstifadəçini bazaya saxlamaq
        return userRepository.save(student);
    }

    // Giriş (Login) məntiqi
    public Student loginUser(String email, String rawPassword) {
        // 1. Email-ə görə istifadəçi tapmaq
        Student studentProfile = userRepository.findByEmail(email).orElseThrow();

        // 2. Şifrəni yoxlamaq (Həqiqi layihədə HASH yoxlanılır)
        if (studentProfile.getPassword().equals(rawPassword)) {
            // Şifrələr uyğundur
            return studentProfile;
        } else {
            // Şifrə yanlışdır
            throw new RuntimeException("Email və ya şifrə yanlışdır!");
        }
    }
}
