package com.example.courceWork072423.service;

import com.example.courceWork072423.model.Question;

import java.util.Collection;

public interface QuestionService {

    Question addQuestion(Question question);

    Collection<Question> getAllQuestion();

    Question removeQuestion (Question question);

    Question getRandomQuestion();

}
