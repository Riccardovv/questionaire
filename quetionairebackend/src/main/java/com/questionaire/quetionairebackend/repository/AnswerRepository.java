package com.questionaire.quetionairebackend.repository;

import com.questionaire.quetionairebackend.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
