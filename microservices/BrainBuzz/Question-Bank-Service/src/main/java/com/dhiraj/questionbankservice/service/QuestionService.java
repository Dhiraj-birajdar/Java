package com.dhiraj.questionbankservice.service;

import com.dhiraj.questionbankservice.model.Question;
import com.dhiraj.questionbankservice.model.QuestionWrapper;
import com.dhiraj.questionbankservice.model.Response;
import com.dhiraj.questionbankservice.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
        try {
            return new ResponseEntity<>(questionRepository.findByCategory(category),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<String> addQuestion(Question question) {
        questionRepository.save(question);
        return new ResponseEntity<>("success",HttpStatus.CREATED);
    }

    public List<String> createQuiz(String category, int totalQuestions) {
        return questionRepository.findRandomQuestionsByCategory(category,totalQuestions);

    }

    public List<QuestionWrapper> getQuestions(List<String> questionIds) {
        List<Question> questions = questionRepository.findAllById(questionIds);
        List<QuestionWrapper> lq = new ArrayList<>();

        for(Question q: questions){
            lq.add(QuestionWrapper.wrap(q));
        }
        return lq;
    }

    public int calculateScore(List<Response> responses) {
        int score = 0;
        for(Response response: responses){
            Question q = questionRepository.findById(response.getId()).orElse(new Question());
            if(q.getAnswer().equals(response.getOption()))
                score++;
        }
        return score;
    }
}
