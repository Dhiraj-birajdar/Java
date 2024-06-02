package com.hollywood.hollywood_data_spring_boot.dto;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private int filmId;
    private String title;
    private String description;
    @Column(name = "release_year")
    private int releaseYear;
    private short length;
}
