ALTER TABLE mysql_db.employees ADD FOREIGN KEY (details_id)
    REFERENCES mysql_db.details(id);