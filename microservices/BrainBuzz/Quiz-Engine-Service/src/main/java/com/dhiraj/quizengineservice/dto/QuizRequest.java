package com.dhiraj.quizengineservice.dto;

import lombok.Data;

@Data
public class QuizRequest {
    private String title;
    private String category;
    private int totalQuestions;
}
