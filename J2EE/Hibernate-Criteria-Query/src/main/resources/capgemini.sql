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


+----+----------+-------------------+-------------------+--------+------+------------+
| id | name     | profile           | email             | salary | age  | experience |
+----+----------+-------------------+-------------------+--------+------+------------+
|  1 | Radha    | dev               | radha@mail.com    |  20000 |   25 |          5 |
|  2 | Amar     | dev               | amar@example.com  |  25000 |   28 |          7 |
|  3 | Suman    | test              | suman@example.com |  51000 |   30 |         10 |
|  4 | John     | test              | john@example.com  |  55000 |   35 |         12 |
|  5 | Doe      | dev               | doe@example.com   |  60000 |   40 |         15 |
+----+----------+-------------------+-------------------+--------+------+------------+