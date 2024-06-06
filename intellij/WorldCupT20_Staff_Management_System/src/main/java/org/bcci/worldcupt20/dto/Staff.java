package org.bcci.worldcupt20.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
//    @Null(message = "Staff ID should be null")
    private int staffId;

    @Column(name = "firstname")
    @NotNull(message = "First name cannot be null")
    private String firstName;

    @Column(name = "lastname")
    @NotNull(message = "Last name cannot be null")
    private String lastName;

    @NotNull(message = "Role cannot be null")
    private String role;

    @Positive(message = "Salary should be positive")
    private int salary;

    @Min(value = 18, message = "Age should be greater than 18")
    private int age;

    @Column(name = "hiredate")
    @PastOrPresent(message = "Hire date should be in the past or present")
    private LocalDateTime hireDate;
}
