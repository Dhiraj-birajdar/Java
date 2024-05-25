CREATE DATABASE IF NOT EXISTS capgemini;
use capgemini;
create table if not exists emp(
    id int AUTO_INCREMENT PRIMARY KEY,
    name varchar(50),
    salary int,
    department varchar(50),
    location varchar(50)
);

INSERT INTO emp (name, salary, department, location) VALUES
('Anup', 10000, 'Dev', 'Pune'),
('Rani', 26000, 'Test', 'Nashik'),
('Jay', 18000, 'Dev', 'Nagpur'),
('Vishal', 22000, 'Support', 'Pune'),
('Shina', 35000, 'Test', 'Nagpur'),
('Rony', 11000, 'Support', 'Nagpur'),
('Pooja', 38000, 'Dev', 'Nashik');

-- q1
select name from emp;

-- q2
select count(*) from emp;

-- q3
select distinct department from emp;

-- q4
select department,count(name) from emp GROUP BY department;

-- q5
select name from emp where salary = (select max(salary) from emp);

-- q6
select name from emp where salary = (select min(salary) from emp);

-- q7
select count(*) from emp where salary > 20000;

-- q8
select avg(salary) from emp;

-- q9
select * from emp order by salary desc limit 5;

-- q10
select * from emp WHERE department = "Marketing";

-- q11
select count(name) from emp where salary >= 5000 and salary <= 25000;

-- q12
select * from emp WHERE salary = null;

-- q13
select * from emp WHERE name like "j%";

-- q14
select salary from emp order by salary desc;

-- q15
select sum(salary) from emp;

-- q16
SELECT *
FROM emp
WHERE name IN (
    SELECT name
    FROM emp
    GROUP BY name
    HAVING COUNT(*) > 1
);

-- q17
select count(*) from emp WHERE location = "Pune";

-- q18
select avg(salary) from emp WHERE department = "Dev";

-- q19
select * from emp where salary > (select avg(salary) from emp);

-- q20
select * from emp where department = "Test" and salary=(select min(salary) from emp where department = "Test");

-- q21
select sum(salary) from emp where department = "Dev" or department = "support";

-- q22
select sum(salary) from emp WHERE location = "Pune";


select * from emp;
