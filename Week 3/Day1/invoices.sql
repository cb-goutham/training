create table invoices(
	id INT(4) PRIMARY KEY NOT NULL,
	cus_Id INT(4),
	veh_Id INT(4),
	amount_total FLOAT(10,2),
	employee_assigned INT(4),
	FOREIGN KEY (employee_assigned) REFERENCES employees(id),
	FOREIGN KEY (cus_Id) REFERENCES customers(id),
	FOREIGN KEY (veh_Id) REFERENCES vehicles(id)
);