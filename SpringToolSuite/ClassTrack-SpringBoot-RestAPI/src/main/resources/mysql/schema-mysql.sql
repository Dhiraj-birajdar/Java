-- Create Classroom table
CREATE TABLE `classroom` (
 `id` bigint NOT NULL AUTO_INCREMENT,
 `name` varchar(255) NOT NULL,
 PRIMARY KEY (`id`)
);

-- Create ClassSchedule table
CREATE TABLE `class_schedule` (
 `id` bigint NOT NULL AUTO_INCREMENT,
 `classroom_id` bigint NOT NULL,
 `day_of_week` varchar(255) NOT NULL,
 `end_time` time NOT NULL,
 `start_time` time NOT NULL,
 `subject_id` bigint NOT NULL,
 PRIMARY KEY (`id`)
);

-- Create Course table
CREATE TABLE `course` (
 `id` bigint NOT NULL AUTO_INCREMENT,
 `name` varchar(255) NOT NULL,
 PRIMARY KEY (`id`)
);

-- Create Department table
CREATE TABLE `department` (
 `id` bigint NOT NULL AUTO_INCREMENT,
 `name` varchar(255) NOT NULL,
 PRIMARY KEY (`id`)
);

-- Create Faculty table
CREATE TABLE `faculty` (
 `id` bigint NOT NULL AUTO_INCREMENT,
 `department_id` bigint NOT NULL,
 `email` varchar(255) NOT NULL,
 `name` varchar(255) NOT NULL,
 PRIMARY KEY (`id`),
 UNIQUE KEY `UK_okvwiun995a8pss0idh99s7yq` (`email`)
);

-- Create Subject table
CREATE TABLE `subject` (
 `id` bigint NOT NULL AUTO_INCREMENT,
 `course_id` bigint NOT NULL,
 `name` varchar(255) NOT NULL,
 PRIMARY KEY (`id`)
);

-- Create Faculty Attendance table
CREATE TABLE faculty_attendance (
 id INT AUTO_INCREMENT PRIMARY KEY,
 faculty_id INT NOT NULL,
 class_schedule_id INT NOT NULL,
 date DATE NOT NULL,
 status VARCHAR(20) NOT NULL,
 FOREIGN KEY (faculty_id) REFERENCES faculties (id),
 FOREIGN KEY (class_schedule_id) REFERENCES class_schedules (id)
);