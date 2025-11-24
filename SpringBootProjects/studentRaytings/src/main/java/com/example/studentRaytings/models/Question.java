package com.example.studentRaytings.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "questions")
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "question_text",  columnDefinition = "text", nullable = false)
    private String questionText;

    @Column(name = "option_a", nullable = false)
    private String optionA;

    @Column(name = "option_b",nullable = false)
    private String optionB;

    @Column(name = "option_c", nullable = false)
    private String optionC;

    @Column(name = "option_d", nullable = false)
    private String optionD; // 4 seçim daxil edək

    @Column(name = "correct_answer", nullable = false)
    private String correctAnswer; // Düzgün cavab (A, B, C və ya D)

    // Lombok sayəsində Getter/Setter-lər avtomatik yaradılır.

    // Explicit setters/getters for compatibility when Lombok is not available
    public Long getId() { return this.id; }
    public void setId(Long id) { this.id = id; }

    public String getQuestionText() { return this.questionText; }
    public void setQuestionText(String questionText) { this.questionText = questionText; }

    public String getOptionA() { return this.optionA; }
    public void setOptionA(String optionA) { this.optionA = optionA; }

    public String getOptionB() { return this.optionB; }
    public void setOptionB(String optionB) { this.optionB = optionB; }

    public String getOptionC() { return this.optionC; }
    public void setOptionC(String optionC) { this.optionC = optionC; }

    public String getOptionD() { return this.optionD; }
    public void setOptionD(String optionD) { this.optionD = optionD; }

    public String getCorrectAnswer() { return this.correctAnswer; }
    public void setCorrectAnswer(String correctAnswer) { this.correctAnswer = correctAnswer; }
}