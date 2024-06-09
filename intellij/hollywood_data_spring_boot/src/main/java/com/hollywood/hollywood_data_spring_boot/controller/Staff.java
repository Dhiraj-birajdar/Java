package com.hollywood.hollywood_data_spring_boot.controller;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "staffid")
    private int staffId;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    private String role;

    private int salary;

    private int age;

    @Column(name = "hiredate")
    private LocalDateTime hireDate;
}
