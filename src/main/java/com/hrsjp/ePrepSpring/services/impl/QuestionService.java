package com.hrsjp.ePrepSpring.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrsjp.ePrepSpring.entities.Question;
import com.hrsjp.ePrepSpring.repos.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;

	public List<Question> getAllQuestions() {
		return this.questionRepository.findAll();
	}
	
	public Question addNewQuestion(Question question) {
		return this.questionRepository.save(question);
	}
}
