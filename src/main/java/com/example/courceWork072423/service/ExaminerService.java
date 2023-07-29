package com.example.courceWork072423.serice;

import com.example.courceWork072423.model.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestion(int amount);
}
