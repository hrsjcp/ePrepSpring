package com.hrsjp.ePrepSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrsjp.ePrepSpring.entities.Question;
import com.hrsjp.ePrepSpring.services.impl.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;

	@GetMapping("/all-question")
	public ResponseEntity<?> getAllQuestions() {
		List<Question> questions = this.questionService.getAllQuestions();
		return new ResponseEntity<>(questions, HttpStatus.OK);
	}
	
	@PostMapping("/add-question")
	public ResponseEntity<?> addNewQuestion(@RequestBody Question question) {
		Question addedQuestion = this.questionService.addNewQuestion(question);
		return new ResponseEntity<>(addedQuestion, HttpStatus.OK);
	}
}
