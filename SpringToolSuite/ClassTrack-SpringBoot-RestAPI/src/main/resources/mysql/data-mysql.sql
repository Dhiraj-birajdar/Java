
INSERT INTO classroom (name) VALUES ('Room 101'), ('Room 102'), ('Room 103'), ('Room 104'), ('Room 105');


-- Insert dummy data into ClassSchedule table
INSERT INTO class_schedule (classroom_id, day_of_week, end_time, start_time, subject_id) VALUES
(1, 'Monday', '10:00:00', '08:00:00', 1),
(2, 'Tuesday', '11:00:00', '09:00:00', 2),
(3, 'Wednesday', '12:00:00', '10:00:00', 3),
(1, 'Thursday', '13:00:00', '11:00:00', 1),
(2, 'Friday', '14:00:00', '12:00:00', 2);


-- Insert dummy data into Course table
INSERT INTO course (name) VALUES
('Computer Science'),
('Mathematics'),
('Physics'),
('Biology'),
('Chemistry');


-- Insert dummy data into Department table
INSERT INTO department (name) VALUES
('Computer Science'),
('Mathematics'),
('Physics'),
('Biology'),
('Chemistry');


INSERT INTO faculty (department_id, email, name) VALUES
(1, 'john.doe@example.com', 'John Doe'),
(2, 'jane.smith@example.com', 'Jane Smith'),
(1, 'alex.jones@example.com', 'Alex Jones'),
(3, 'emily.brown@example.com', 'Emily Brown'),
(2, 'michael.davis@example.com', 'Michael Davis');


INSERT INTO subject (course_id, name) VALUES
(1, 'Introduction to Computer Science'),
(2, 'Calculus'),
(3, 'Mechanics'),
(4, 'Genetics'),
(5, 'Organic Chemistry');
-- Insert dummy data into Subject table
INSERT INTO subject (course_id, name) VALUES
(1, 'Data Structures'),
(1, 'Algorithms'),
(2, 'Linear Algebra'),
(2, 'Probability and Statistics'),
(3, 'Thermodynamics'),
(3, 'Fluid Mechanics'),
(4, 'Molecular Biology'),
(4, 'Microbiology'),
(5, 'Inorganic Chemistry'),
(5, 'Physical Chemistry');


INSERT INTO faculty_attendance (faculty_id, class_schedule_id, date, status) VALUES
(1, 1, '2024-06-01', 'Present'),
(2, 2, '2024-06-01', 'Absent'),
(3, 3, '2024-06-01', 'Present'),
(4, 1, '2024-06-01', 'Absent'),
(5, 2, '2024-06-01', 'Present');
