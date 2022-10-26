package com.questionaire.quetionairebackend.controller;

import com.questionaire.quetionairebackend.model.Question;
import com.questionaire.quetionairebackend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questions")
@CrossOrigin("http://localhost:3000")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping()
    public List<Question> getAll(){
        return questionService.getAll();
    }

}
