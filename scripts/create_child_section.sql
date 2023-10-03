CREATE TABLE child_section (
    child_id int NOT NULL,
    section_id int NOT NULL,
    PRIMARY KEY (child_id, section_id),
    FOREIGN KEY (child_id) REFERENCES mysql_db.children(id),
    FOREIGN KEY (section_id) REFERENCES mysql_db.section(id)
)