package com.example.courceWork072423.repository;

import com.example.courceWork072423.model.Question;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@Repository
public class JavaQuestionRepository implements QuestionRepository{
    private final Set<Question> questionSet = new HashSet<>();
    @Override
    public Question addQuestion(Question question) {
        questionSet.add(question);
        return question;
    }

    @Override
    public Question removeQuestion(Question question) {
        questionSet.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAllQuestion() {
        return Collections.unmodifiableSet(questionSet);
    }
}
