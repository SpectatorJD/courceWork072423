package com.example.courceWork072423.controller;

import com.example.courceWork072423.model.Question;
import com.example.courceWork072423.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    private QuestionService javaQuestionService;
    @GetMapping("/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer){
        return javaQuestionService.addQuestion(new Question(question, answer));
    }
    @GetMapping("/remove")
    public Question removeQuestion(@RequestParam String question, @RequestParam String answer){
        return javaQuestionService.removeQuestion(new Question(question, answer));
    }
    @GetMapping("/all")
    public Collection<Question> getAll(){
        return javaQuestionService.getAllQuestion();
    }

}
