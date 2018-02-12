create table customers(
	id INT(4) PRIMARY KEY NOT NULL,
	name VARCHAR(25),
	age INT(3),
	contact INT(10),
	emp_id INT(4),
	FOREIGN KEY (emp_id) REFERENCES employees(id)
);