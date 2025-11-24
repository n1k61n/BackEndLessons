package com.example.studentRaytings.controllers;

import com.example.studentRaytings.dtos.ExamScoreRequest;
import com.example.studentRaytings.models.StudentScore;

import com.example.studentRaytings.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 1. REST API Controller (JSON qaytarır)
@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:5500")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentScore> createStudent(@RequestBody StudentScore studentScore) {
        StudentScore savedStudentScore = studentService.saveStudent(studentScore);
        return new ResponseEntity<>(savedStudentScore, HttpStatus.CREATED);
    }

    @GetMapping
    public List<StudentScore> getAllStudents() {
        return studentService.getAllStudentScores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable String id) {
        try {
            long studentId = Long.parseLong(id);
            StudentScore studentScore = studentService.getStudentScoreById(studentId);
            return ResponseEntity.ok(studentScore);
        } catch (NumberFormatException nfe) {
            return ResponseEntity.badRequest().body(
                    java.util.Map.of("error", "Bad Request", "message", "Invalid student id: " + id)
            );
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}/exam-result")
    public ResponseEntity<?> updateExamScore(@PathVariable String id, @RequestBody ExamScoreRequest request) {
        try {
            long studentId = Long.parseLong(id);
            StudentScore updatedStudentScore = studentService.updateExamResult(studentId, request.getExamScore());
            return ResponseEntity.ok(updatedStudentScore);
        } catch (NumberFormatException nfe) {
            return ResponseEntity.badRequest().body(
                    java.util.Map.of("error", "Bad Request", "message", "Invalid student id: " + id)
            );
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/ranking")
    public List<StudentScore> getRankingTable() {
        return studentService.getStudentRanking();
    }
}