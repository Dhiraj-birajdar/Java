package com.dhiraj.questionbankservice.controller;


import com.dhiraj.questionbankservice.model.Question;
import com.dhiraj.questionbankservice.model.QuestionWrapper;
import com.dhiraj.questionbankservice.model.Response;
import com.dhiraj.questionbankservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @Autowired
    Environment environment;

    @GetMapping("allquestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @GetMapping("createquiz")
    public ResponseEntity<List<String>> createQuiz(
            @RequestParam(defaultValue = "Java",required = false) String category,
            @RequestParam(defaultValue = "5",required = false) int noOfQuestions
    ){
        List<String> questions = questionService.createQuiz(category,noOfQuestions);
        return ResponseEntity.ok(questions);
    }

    @PostMapping("getquestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestions(@RequestBody List<String> questionIds){
        System.out.println(environment.getProperty("local.server.port"));
        List<QuestionWrapper> lq = questionService.getQuestions(questionIds);
        return ResponseEntity.ok(lq);
    }

    @PostMapping("calculatescore")
    public ResponseEntity<Integer> calculateScore(@RequestBody List<Response> responses){
        return ResponseEntity.ok(questionService.calculateScore(responses));

    }

}
