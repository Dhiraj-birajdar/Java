package com.jobpostmongodb;

import com.jobpostmongodb.model.Post;
import com.jobpostmongodb.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobPostMongoDbApplication {

    public static void main(String[] args) {

        SpringApplication.run(JobPostMongoDbApplication.class, args);
    }

}
