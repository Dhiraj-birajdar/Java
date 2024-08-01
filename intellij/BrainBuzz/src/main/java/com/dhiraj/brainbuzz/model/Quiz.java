package com.dhiraj.brainbuzz.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Data
@Document
public class Quiz {

    @Id
    private String id;
    private String title;

    @DocumentReference(lazy = true)
    private List<Question> questions;

}
