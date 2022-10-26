package com.questionaire.quetionairebackend.service;

import com.questionaire.quetionairebackend.model.Answer;
import com.questionaire.quetionairebackend.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public Answer saveAnswer(Answer answer){
        return answerRepository.save(answer);
    }

}
