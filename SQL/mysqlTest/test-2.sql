-- Active: 1710342347852@@127.0.0.1@3306@capgemini
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
('Radha', 'dev', 'radha@example.com', 20000, 25, 5),
('Amar', 'dev', 'amar@example.com', 25000, 28, 7),
('Suman', 'test', 'suman@example.com', 51000, 30, 10),
('John', 'test', 'john@example.com', 55000, 35, 12),
('Doe', 'dev', 'doe@example.com', 60000, 40, 15);

-- q1
alter table employee add column branch varchar(50);

-- q2
select sum(salary) from employee;

-- q3
select max(salary) from employee where profile = 'test';

-- q4
select avg(experience) from employee;

-- q5
select name from employee where salary = (select max(salary) from employee);

-- q6
select name,experience from employee where salary = (select min(salary) from employee);

-- q7
select count(*) from employee;

-- q8
select name from employee where profile = "test" and salary > 25000;

-- q9
update employee set profile = "support" where name = "Radha";

-- q10
select salary as second_highest from employee ORDER BY salary DESC limit 1 OFFSET 1 ;

-- q11
select salary as second_highest from employee ORDER BY salary limit 1 OFFSET 1 ;

-- q12
select avg(salary) from employee where profile = "dev";

-- q13
select name, salary from employee where experience = (select min(experience) from employee);

-- q14
select name from employee where salary = (select max(salary) from employee where age = (select min(age) from employee));

-- q15
truncate employee;

select * from employee;