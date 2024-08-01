package com.dhiraj.brainbuzz.repository;

import com.dhiraj.brainbuzz.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


import org.springframework.data.mongodb.repository.Aggregation;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {

    List<Question> findByCategory(String category);

    @Aggregation(pipeline = {
        "{ $match: { category: ?0 } }",
        "{ $sample: { size: ?1 } }"
    })
    List<Question> findRandomQuestionsByCategory(String category, int totalQuestions);
}
