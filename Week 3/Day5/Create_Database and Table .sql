create database phonebook;

create table person(
	pid INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	name VARCHAR(25),
	address VARCHAR(50)
);

create table phoneNumbers(
	id INT NOT NULL,
	type VARCHAR(10),
	phNumber BIGINT ,
	FOREIGN KEY (id) REFERENCES person(pid)
);