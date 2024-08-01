package com.dhiraj.quizengineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizEngineServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizEngineServiceApplication.class, args);
    }

}
