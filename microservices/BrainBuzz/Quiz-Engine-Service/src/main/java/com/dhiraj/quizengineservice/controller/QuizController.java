package com.dhiraj.quizengineservice.controller;

import com.dhiraj.quizengineservice.dto.QuizRequest;
import com.dhiraj.quizengineservice.model.QuestionWrapper;
import com.dhiraj.quizengineservice.model.Response;
import com.dhiraj.quizengineservice.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizRequest quizRequest){
        return quizService.createQuiz(quizRequest);
    }
    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable String id){
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable String id, @RequestBody List<Response> responses){
        return quizService.calculateResult(id, responses);
    }
}
