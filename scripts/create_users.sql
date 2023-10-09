CREATE TABLE users (
    username varchar(15),
    password varchar(100),
    enabled tinyint(1),
    PRIMARY KEY (username)
)