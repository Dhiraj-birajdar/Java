package com.dhiraj.brainbuzz.controller;

import com.dhiraj.brainbuzz.model.QuestionWrapper;
import com.dhiraj.brainbuzz.model.Response;
import com.dhiraj.brainbuzz.service.QuizService;
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
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int totalQuestions, @RequestParam String title){
        return quizService.createQuiz(category, totalQuestions, title);
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
