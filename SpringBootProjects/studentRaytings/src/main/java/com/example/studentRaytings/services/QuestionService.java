package com.example.studentRaytings.services;

import com.example.studentRaytings.models.Question;
import com.example.studentRaytings.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    // count qədər təsadüfi sual çəkir
    public List<Question> getRandomQuestions(int count) {
        List<Question> allQuestions = questionRepository.findAll();

        if (allQuestions.isEmpty()) {
            return Collections.emptyList(); // data yoxdursa boş list qaytar
        }

        // bütün sualları qarışdır
        Collections.shuffle(allQuestions);

        // count qədər limitlə qaytar, amma toplamdan çox olmayacaq
        return allQuestions.stream()
                .limit(Math.min(count, allQuestions.size()))
                .collect(Collectors.toList());
    }

    // 50 random sual üçün shortcut
    public List<Question> get50RandomQuestions() {
        List<Question> allQuestions = questionRepository.findAll();
        Collections.shuffle(allQuestions);
        return allQuestions.stream().limit(Math.min(50, allQuestions.size())).collect(Collectors.toList());
    }
}
