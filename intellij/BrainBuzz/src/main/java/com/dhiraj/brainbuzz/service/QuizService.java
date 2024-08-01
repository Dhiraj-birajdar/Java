package com.dhiraj.brainbuzz.service;


import com.dhiraj.brainbuzz.model.Question;
import com.dhiraj.brainbuzz.model.QuestionWrapper;
import com.dhiraj.brainbuzz.model.Quiz;
import com.dhiraj.brainbuzz.model.Response;
import com.dhiraj.brainbuzz.repository.QuestionRepository;
import com.dhiraj.brainbuzz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepository;
    @Autowired
    QuestionRepository questionRepository;


    public ResponseEntity<String> createQuiz(String category, int totalQuestions, String title) {

        List<Question> questions = questionRepository.findRandomQuestionsByCategory(category, totalQuestions);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepository.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);

    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(String id) {
        Optional<Quiz> quiz = quizRepository.findById(id);
        List<Question> questionsFromDB = quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();
        for(Question q : questionsFromDB){
            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestion(), q.getA(), q.getB(), q.getC(), q.getD());
            questionsForUser.add(qw);
        }

        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);

    }

    public ResponseEntity<Integer> calculateResult(String id, List<Response> responses) {
        Quiz quiz = quizRepository.findById(id).get();
        List<Question> questions = quiz.getQuestions();
        int correct = 0;
        int i = 0;
        for(Response response : responses){
            if(response.getOption().equals(questions.get(i++).getAnswer()))
                correct++;
        }
        return new ResponseEntity<>(correct, HttpStatus.OK);
    }
}
