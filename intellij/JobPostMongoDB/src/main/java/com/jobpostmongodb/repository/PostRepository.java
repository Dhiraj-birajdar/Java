package com.jobpostmongodb.repository;

import com.jobpostmongodb.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
