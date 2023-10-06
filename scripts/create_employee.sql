CREATE TABLE employees (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(15),
    surname varchar(25),
    department varchar(20),
    salary int,
    PRIMARY KEY (id)
);
INSERT INTO mysql_db.employees (name, surname, department, salary)
VALUES
    ('Aleksei', 'Briukhachev', 'IT', 700),
    ('Oleg', 'Ivanov', 'Sales', 500),
    ('Viktor', 'Sidorov', 'HR', 850);