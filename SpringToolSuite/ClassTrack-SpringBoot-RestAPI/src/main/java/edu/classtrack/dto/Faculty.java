package edu.classtrack.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "faculty")
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name is required")
    private String name;

    @Email
    @Column(unique = true)
    @NotNull(message = "Email is required")
    private String email;

    @Column(name = "department_id")
    @NotNull(message = "Department ID is required")
    private Long departmentId;
}

