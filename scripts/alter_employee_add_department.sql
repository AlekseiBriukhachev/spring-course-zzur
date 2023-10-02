ALTER TABLE mysql_db.employees ADD COLUMN department_id int,
    ADD FOREIGN KEY (department_id) REFERENCES mysql_db.department(id);