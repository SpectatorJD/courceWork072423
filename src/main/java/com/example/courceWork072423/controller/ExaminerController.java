package com.example.courceWork072423.controller;

import com.example.courceWork072423.model.Question;
import com.example.courceWork072423.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
public class ExaminerController {
    private final ExaminerService examinerService;


    public ExaminerController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/exam/get/{amount}")
    public Collection<Question>getQuestions(@PathVariable Integer amount){
        return examinerService.getQuestion(amount);
    }
}

