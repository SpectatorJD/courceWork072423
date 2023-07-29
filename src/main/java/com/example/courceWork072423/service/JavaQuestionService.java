package com.example.courceWork072423.service;

import com.example.courceWork072423.model.Question;
import com.example.courceWork072423.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
public class JavaQuestionService implements QuestionService{
    private final QuestionRepository javaQuestionRepository;
    private final Random random;
    @Autowired
    public JavaQuestionService(QuestionRepository javaQuestionRepository) {
        this.javaQuestionRepository = javaQuestionRepository;
        this.random = new Random();

    }
   public JavaQuestionService(QuestionRepository javaQuestionRepository, Random random) {
        this.javaQuestionRepository = javaQuestionRepository;
        this.random=random;
    }

    @Override
    public Question addQuestion(Question question) {
        return javaQuestionRepository.addQuestion(question);
    }

    @Override
    public Collection<Question> getAllQuestion() {
        return javaQuestionRepository.getAllQuestion();
    }

    @Override
    public Question removeQuestion(Question question) {
        return javaQuestionRepository.removeQuestion(question);
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> questions = new ArrayList<>(javaQuestionRepository.getAllQuestion());
        return questions.get(random.nextInt(questions.size()));

    }
}
