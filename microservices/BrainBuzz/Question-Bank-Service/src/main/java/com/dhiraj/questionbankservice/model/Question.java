package com.dhiraj.questionbankservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Question {

    @Id
    private String id;
    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private String answer;
    private String difficulty;
    private String category;


}