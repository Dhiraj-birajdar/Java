package com.dhiraj.quizengineservice.repository;

import com.dhiraj.quizengineservice.model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuizRepository extends MongoRepository<Quiz, String> {
}
