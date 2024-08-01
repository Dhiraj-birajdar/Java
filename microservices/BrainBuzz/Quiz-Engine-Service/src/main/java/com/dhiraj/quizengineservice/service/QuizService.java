package com.dhiraj.quizengineservice.service;


import com.dhiraj.quizengineservice.dto.QuizRequest;
import com.dhiraj.quizengineservice.feign.QuestionServiceInterface;
import com.dhiraj.quizengineservice.model.QuestionWrapper;
import com.dhiraj.quizengineservice.model.Quiz;
import com.dhiraj.quizengineservice.model.Response;
import com.dhiraj.quizengineservice.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepository;
    @Autowired
    QuestionServiceInterface questionService;


    public ResponseEntity<String> createQuiz(QuizRequest quizRequest) {

        List<String> questionIds = questionService.createQuiz(quizRequest.getCategory(), quizRequest.getTotalQuestions()).getBody();

        Quiz quiz = new Quiz();
        quiz.setTitle(quizRequest.getTitle());
        quiz.setQuestionIds(questionIds);
        quizRepository.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);

    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(String id) {
        Quiz quiz = quizRepository.findById(id).orElse(new Quiz());
//        List<String> questionIds = quiz.getQuestionIds();
//        var questions = questionService.getQuestions(questionIds).getBody();
//        List<QuestionWrapper> questionsForUser = new ArrayList<>();
//        for(String qId : questionIds){
//            QuestionWrapper qw = new QuestionWrapper(qId.getId(), q.getQuestion(), q.getA(), q.getB(), q.getC(), q.getD());
//            questionsForUser.add(qw);
//        }

        return questionService.getQuestions(quiz.getQuestionIds());

    }

    public ResponseEntity<Integer> calculateResult(String id, List<Response> responses) {
//        int score = questionService.calculateScore(responses).getBody();
//        Quiz quiz = quizRepository.findById(id).get();
//        List<Question> questions = quiz.getQuestions();
//        int correct = 0;
//        int i = 0;
//        for(Response response : responses){
//            if(response.getOption().equals(questions.get(i++).getAnswer()))
//                correct++;
//        }
        return questionService.calculateScore(responses);
    }
}
