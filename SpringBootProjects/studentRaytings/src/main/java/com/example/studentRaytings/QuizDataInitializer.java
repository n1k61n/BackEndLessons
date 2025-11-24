package com.example.studentRaytings;


import com.example.studentRaytings.models.Question;
import com.example.studentRaytings.repositories.QuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QuizDataInitializer implements CommandLineRunner {

    private final QuestionRepository questionRepository;

    public QuizDataInitializer(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    // 500 sual yaratmaq üçün əsas metod
    @Override
    public void run(String... args) throws Exception {
        if (questionRepository.count() == 0) { // Əgər bazada heç sual yoxdursa
            System.out.println("500 ədəd nümunə sual bazaya yazılır...");

            for (int i = 1; i <= 500; i++) {
                Question q = new Question();
                q.setQuestionText(i + ". Java-da 'Garbage Collection' nə iş görür?");
                q.setOptionA("Yaddaşı avtomatik təmizləyir.");
                q.setOptionB("Kodu C++ dilinə çevirir.");
                q.setOptionC("Sürətli hesablama aparır.");
                q.setOptionD("Yeni Obyektlər yaradır.");

                // Məqsəd, test üçün verilənlərin olmasıdır, buna görə düzgün cavabı A təyin edək.
                q.setCorrectAnswer("A");

                questionRepository.save(q);
            }
            System.out.println("Cəmi " + questionRepository.count() + " sual uğurla bazaya daxil edildi.");
        }
    }
}