package com.example.courceWork072423.service;

import com.example.courceWork072423.exception.NotQuestionException;
import com.example.courceWork072423.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@Service
public class ExaminerServiceImp implements com.example.courceWork072423.service.ExaminerService {

    public ExaminerServiceImp(QuestionService questionService) {
        this.questionService = questionService;
    }

    private QuestionService questionService;
    @Override
    public Collection<Question> getQuestion(int amount) {
        Set<Question> questionSet = new HashSet<>();
        if (amount > questionService.getAllQuestion().size()){
            throw new NotQuestionException();
        }
        while (questionSet.size()< amount){
            questionSet.add(questionService.getRandomQuestion());
        }
        return questionSet;
    }
}
