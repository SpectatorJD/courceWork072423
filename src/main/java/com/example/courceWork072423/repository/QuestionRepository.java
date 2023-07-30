package com.example.courceWork072423.repository;

import com.example.courceWork072423.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question addQuestion (Question question);

    Question removeQuestion (Question question);
    Collection<Question> getAllQuestion();

}
