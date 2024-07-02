package edu.classtrack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
@Data
@NoArgsConstructor
@Table(name = "class_schedule")
public class ClassSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "subject_id")
	@NotNull(message = "Subject ID is required")
	private Long subjectId;

	@Column(name = "classroom_id")
	@NotNull(message = "Classroom ID is required")
	private Long classroomId;

	@Column(name = "day_of_week")
	@NotBlank(message = "Day of week is required")
	private String dayOfWeek;

	@Column(name = "start_time")
	@NotNull(message = "Start time is required")
	private Time startTime;

	@Column(name = "end_time")
	@NotNull(message = "End time is required")
	private Time endTime;
}

