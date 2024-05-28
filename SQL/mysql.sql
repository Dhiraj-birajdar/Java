-- Active: 1710342347852@@127.0.0.1@3306@tka
SHOW TABLES;

CREATE TABLE car (
    id INT NOT NULL,
    company VARCHAR(255),
    owner VARCHAR(255),
    cost DOUBLE
);

INSERT INTO
    car (id, company, owner, cost)
VALUES (1, 'Toyota', 'Tom', 10000);

INSERT INTO
    car (id, company, owner, cost)
VALUES (2, 'Honda', 'Jerry', 20000);

USE tka;

SHOW TABLES;

SELECT * FROM faculty;

TRUNCATE faculty;

SELECT * FROM subject;

TRUNCATE subject;

DROP DATABASE tka;