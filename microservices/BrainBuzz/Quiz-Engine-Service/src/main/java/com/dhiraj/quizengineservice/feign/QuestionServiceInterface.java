package com.dhiraj.quizengineservice.feign;

import com.dhiraj.quizengineservice.model.QuestionWrapper;
import com.dhiraj.quizengineservice.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("QUESTION-BANK-SERVICE")
public interface QuestionServiceInterface {


    @GetMapping("question/createquiz")
    public ResponseEntity<List<String>> createQuiz(
            @RequestParam(defaultValue = "Java",required = false) String category,
            @RequestParam(defaultValue = "5",required = false) int noOfQuestions
    );

    @PostMapping("question/getquestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestions(@RequestBody List<String> questionIds);

    @PostMapping("question/calculatescore")
    public ResponseEntity<Integer> calculateScore(@RequestBody List<Response> responses);
}
