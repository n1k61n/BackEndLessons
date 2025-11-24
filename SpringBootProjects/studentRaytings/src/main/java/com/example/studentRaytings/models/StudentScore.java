package com.example.studentRaytings.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "students_score")
public class StudentScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "right_answers", nullable = false)
    private Integer rightAnswers = 0;

    @Column(name = "wrong_answer", nullable = false)
    private Integer wrongAnswer = 0;

    @Column(name = "attempt_count", nullable = false)
    private Integer attemptCount = 0;


    @Column(name = "activity_score", nullable = false)
    private Double activityScore = 0.0;

    @Column(name = "gpa_score", nullable = false)
    private Double gpaScore = 0.0;

    @Column(name = "project_score", nullable = false)
    private Double projectScore = 0.0;

    @Column(name = "overall_score", nullable = false)
    private Double overallScore = 0.0;

    @Column(name = "exam_score", nullable = false)
    private Double examScore = 0.0;

    @Column(name = "rank")
    private Integer rank = 0;

    @Column(name = "test_date")
    private LocalDateTime testDate = null;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Student student;

    // Explicit getters/setters in case Lombok annotation processing isn't active
    public Long getId() { return this.id; }
    public void setId(Long id) { this.id = id; }

    public Integer getRightAnswers() { return this.rightAnswers; }
    public void setRightAnswers(Integer rightAnswers) { this.rightAnswers = rightAnswers; }

    public Integer getWrongAnswer() { return this.wrongAnswer; }
    public void setWrongAnswer(Integer wrongAnswer) { this.wrongAnswer = wrongAnswer; }

    public Integer getAttemptCount() { return this.attemptCount; }
    public void setAttemptCount(Integer attemptCount) { this.attemptCount = attemptCount; }

    public Double getActivityScore() { return this.activityScore; }
    public void setActivityScore(Double activityScore) { this.activityScore = activityScore; }

    public Double getGpaScore() { return this.gpaScore; }
    public void setGpaScore(Double gpaScore) { this.gpaScore = gpaScore; }

    public Double getProjectScore() { return this.projectScore; }
    public void setProjectScore(Double projectScore) { this.projectScore = projectScore; }

    public Double getOverallScore() { return this.overallScore; }
    public void setOverallScore(Double overallScore) { this.overallScore = overallScore; }

    public Double getExamScore() { return this.examScore; }
    public void setExamScore(Double examScore) { this.examScore = examScore; }

    public Integer getRank() { return this.rank; }
    public void setRank(Integer rank) { this.rank = rank; }

    public LocalDateTime getTestDate() { return this.testDate; }
    public void setTestDate(LocalDateTime testDate) { this.testDate = testDate; }

    public Student getStudent() { return this.student; }
    public void setStudent(Student student) { this.student = student; }

}