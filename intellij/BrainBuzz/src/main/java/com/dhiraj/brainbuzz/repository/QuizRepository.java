package com.dhiraj.brainbuzz.repository;

import com.dhiraj.brainbuzz.model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuizRepository extends MongoRepository<Quiz, String> {
}
