package com.questionaire.quetionairebackend.service;

import com.questionaire.quetionairebackend.model.Question;
import com.questionaire.quetionairebackend.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAll(){
        return questionRepository.findAll();
    }
}
