package edu.classtrack.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "faculty_attendance")
public class FacultyAttendance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "faculty_id")
	@NotNull(message = "Faculty ID is required")
	private Faculty faculty;

	@ManyToOne
	@JoinColumn(name = "class_schedule_id")
	@NotNull(message = "Class Schedule ID is required")
	private ClassSchedule classSchedule;

	@NotNull(message = "Date is required")
	private LocalDate date;

	private String status;
}

