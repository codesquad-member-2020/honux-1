CREATE TABLE if not exists user (id int identity, email varchar(64) unique, created_date datetime);
