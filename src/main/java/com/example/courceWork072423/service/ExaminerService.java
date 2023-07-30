package com.example.courceWork072423.service;

import com.example.courceWork072423.model.Question;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestion(int amount);
}
