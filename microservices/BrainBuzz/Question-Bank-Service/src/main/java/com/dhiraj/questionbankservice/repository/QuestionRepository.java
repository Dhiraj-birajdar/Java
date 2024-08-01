package com.dhiraj.questionbankservice.repository;

import com.dhiraj.questionbankservice.model.Question;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {

    List<Question> findByCategory(String category);

    @Aggregation(pipeline = {
            "{ $match: { category: ?0 } }",
            "{ $sample: { size: ?1 } }",
            "{ $project: { _id: 1 } }"
    })
    List<String> findRandomQuestionsByCategory(String category, int totalQuestions);
}
