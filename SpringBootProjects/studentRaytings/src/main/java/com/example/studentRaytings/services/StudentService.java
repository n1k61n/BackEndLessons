package com.example.studentRaytings.services;

import com.example.studentRaytings.models.Student;
import com.example.studentRaytings.models.StudentScore;
import com.example.studentRaytings.repositories.StudentScoreRepository;
import com.example.studentRaytings.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;// Repository ilə əlaqə qururuq
    @Autowired
    private StudentScoreRepository studentScoreRepository;// Repository ilə əlaqə qururuq
//    List<StudentScore> ranked = student.stream()
//            .sorted(Comparator.comparingDouble(StudentScore::getExamScore).reversed())
//            .collect(Collectors.toList());
//
//    for (int i = 0; i < ranked.size(); i++) {
//        ranked.get(i).setRank(i + 1);
//    }

    // Məntiq: Bal katsayılarının təyin edilməsi
    // Sabitlər (Ümumi cəmi 1.0, yəni 100% olmalıdır)
    private static final double GPA_WEIGHT = 0.25;      // 25%
    private static final double PROJECT_WEIGHT = 0.25;  // 25%
    private static final double ACTIVITY_WEIGHT = 0.20; // 20%
    private static final double EXAM_WEIGHT = 0.30;     // 30% <--- YENİ


    // Ümumi balı hesablayan köməkçi metod
    private double calculateOverallScore(StudentScore studentScore) {
        double gpa = studentScore.getGpaScore() != null ? studentScore.getGpaScore() : 0.0;
        double project = studentScore.getProjectScore() != null ? studentScore.getProjectScore() : 0.0;
        double activity = studentScore.getActivityScore() != null ? studentScore.getActivityScore() : 0.0;
        double exam = studentScore.getExamScore() != null ? studentScore.getExamScore() : 0.0;

        return (gpa* GPA_WEIGHT) +
                (project * PROJECT_WEIGHT) +
                (activity * ACTIVITY_WEIGHT) +
                (exam * EXAM_WEIGHT); // <--- İmtahan Balı əlavə edildi
    }

    // 1. Yeni telebəni saxlayır və Ümumi Balını hesablayır
    public StudentScore saveStudent(StudentScore studentScore) {
        // İmtahan balı hələ daxil edilməyibsə 0 olsun
        if (studentScore.getExamScore() == 0) {
            studentScore.setExamScore(0.0);
        }

        double overallScore = calculateOverallScore(studentScore);
        studentScore.setOverallScore(overallScore);

        return studentScoreRepository.save(studentScore);
    }

    // 2. İmtahan balını daxil edir və reytinqi yeniləyir (ƏSAS YENİLƏMƏ)
    public StudentScore updateExamResult(Long studentId, double newExamScore) {
        StudentScore studentScore = studentScoreRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + studentId));

        // İmtahan balını yenilə
        studentScore.setExamScore(newExamScore);

        // Ümumi balı yenidən hesabla
        double updatedOverallScore = calculateOverallScore(studentScore);
        studentScore.setOverallScore(updatedOverallScore);

        // Bazaya saxla
        return studentScoreRepository.save(studentScore);
    }

    // 1. Yeni telebəni saxlayır və Ümumi Balını (Overall Score) hesablayır
    public StudentScore saveAndCalculateScore(StudentScore studentScore) {


        // Ümumi balın hesablanması
        double overallScore = (studentScore.getGpaScore() * GPA_WEIGHT) +
                (studentScore.getProjectScore() * PROJECT_WEIGHT) +
                (studentScore.getActivityScore() * ACTIVITY_WEIGHT);

        // Balı modelə yazırıq
        studentScore.setOverallScore(overallScore);

        // Verilənlər bazasına saxlayırıq və yenilənmiş obyekti qaytarırıq
        return studentScoreRepository.save(studentScore);
    }

    // 2. Bütün telebələri Ümumi Bala görə azalan sırada qaytarır (Reytinq cədvəli)
    public List<StudentScore> getStudentRanking() {
        // Use StudentScoreRepository to return scores ordered by overall score
        return studentScoreRepository.findAllByOrderByOverallScoreDesc();
    }

    // Return all StudentScore entries
    public List<StudentScore> getAllStudentScores() {
        return studentScoreRepository.findAll();
    }

    // 3. ID-ə görə telebə tapmaq üçün köməkçi metod (opsional)
    public StudentScore getStudentScoreById(Long id) {
        return studentScoreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }
    // 3. ID-ə görə telebə tapmaq üçün köməkçi metod (opsional)
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }


}