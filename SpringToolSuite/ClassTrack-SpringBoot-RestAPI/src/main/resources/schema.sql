-- Create Classroom table
CREATE TABLE classroom (
 id INT AUTO_INCREMENT PRIMARY KEY,
 name VARCHAR(255) NOT NULL
);

-- Create Course table
CREATE TABLE course (
 id INT AUTO_INCREMENT PRIMARY KEY,
 name VARCHAR(255) NOT NULL
);

-- Create Department table
CREATE TABLE department (
 id INT AUTO_INCREMENT PRIMARY KEY,
 name VARCHAR(255) NOT NULL
);

-- Create Subject table
CREATE TABLE subject (
 id INT AUTO_INCREMENT PRIMARY KEY,
 course_id INT NOT NULL,
 name VARCHAR(255) NOT NULL,
 FOREIGN KEY (course_id) REFERENCES course (id) ON DELETE CASCADE
);

-- Create ClassSchedule table
-- CREATE TABLE class_schedule (
--  id INT AUTO_INCREMENT PRIMARY KEY,
--  classroom_id INT NOT NULL,
--  day_of_week VARCHAR(255) NOT NULL,
--  end_time TIME NOT NULL,
--  start_time TIME NOT NULL,
--  subject_id INT NOT NULL,
--  FOREIGN KEY (classroom_id) REFERENCES classroom (id),
--  FOREIGN KEY (subject_id) REFERENCES subject (id)
-- );

CREATE TABLE class_schedule (
 id INT AUTO_INCREMENT PRIMARY KEY,
 classroom_id INT NOT NULL,
 day_of_week VARCHAR(255) NOT NULL,
 start_time TIME NOT NULL,
 end_time TIME NOT NULL,
 subject_id INT NOT NULL,
 FOREIGN KEY (classroom_id) REFERENCES classroom (id) ON DELETE CASCADE,
 FOREIGN KEY (subject_id) REFERENCES subject (id) ON DELETE CASCADE
);


-- Create Faculty table
CREATE TABLE faculty (
 id INT AUTO_INCREMENT PRIMARY KEY,
 department_id INT NOT NULL,
 email VARCHAR(255) NOT NULL,
 name VARCHAR(255) NOT NULL,
 UNIQUE (email),
 FOREIGN KEY (department_id) REFERENCES department (id) ON DELETE CASCADE
);


-- Create Faculty Attendance table
CREATE TABLE faculty_attendance (
 id INT AUTO_INCREMENT PRIMARY KEY,
 faculty_id INT NOT NULL,
 class_schedule_id INT NOT NULL,
 date DATE NOT NULL,
 status VARCHAR(20) NOT NULL,
 FOREIGN KEY (faculty_id) REFERENCES faculty (id) ON DELETE CASCADE,
 FOREIGN KEY (class_schedule_id) REFERENCES class_schedule (id) ON DELETE CASCADE
);
