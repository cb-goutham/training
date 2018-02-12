create table vehicles(
	id INT(4) PRIMARY KEY NOT NULL,
	type ENUM('CAR','BIKE','BUS'),
	brand VARCHAR(25),
	color VARCHAR(10),
	service_charge FLOAT(10,2)
);