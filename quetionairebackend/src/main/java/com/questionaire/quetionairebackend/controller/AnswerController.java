package com.questionaire.quetionairebackend.controller;

import com.questionaire.quetionairebackend.model.Answer;
import com.questionaire.quetionairebackend.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
@CrossOrigin("http://localhost:3000")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @PostMapping()
    public String saveAnswer(@RequestBody Answer answer){
        answerService.saveAnswer(answer);
        return "New answer registered";
    }

    @PostMapping("/submit")
    public String saveAnswer(@RequestBody List<Answer> answers){
        answers.forEach(answer -> saveAnswer(answer));
        return "Answers registered";
    }
}
