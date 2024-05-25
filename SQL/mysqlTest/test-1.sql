CREATE DATABASE IF NOT EXISTS capgemini;
USE capgemini;

CREATE TABLE if not exists employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    profile VARCHAR(50),
    email VARCHAR(50),
    salary INT,
    age INT,
    experience INT
);
INSERT INTO employee (name, profile, email, salary, age, experience) VALUES
('Kiran', 'dev', 'kiran@example.com', 20000, 25, 5),
('Amar', 'dev', 'amar@example.com', 25000, 28, 7),
('Suman', 'test', 'suman@example.com', 51000, 30, 10),
('John', 'test', 'john@example.com', 55000, 35, 12),
('Doe', 'dev', 'doe@example.com', 60000, 40, 15);

-- q1
SELECT name FROM employee WHERE salary > 20000;

-- q2
SELECT * FROM employee WHERE salary = 51000;

-- q3
SELECT name, experience FROM employee WHERE age > 35;

-- q4
SELECT * FROM employee WHERE profile = 'dev';

-- q5
SELECT name FROM employee WHERE profile = 'test';

-- q6
SELECT * FROM employee WHERE salary >= 25000;

-- q7
SELECT name, email FROM employee WHERE salary != 51000;

-- q8
UPDATE employee SET salary = salary + 10000 WHERE experience < 20;

-- q9
DELETE FROM employee WHERE experience = 21;

-- q10
UPDATE employee SET salary = salary - 21000 WHERE name = 'John';

select * from employee;
