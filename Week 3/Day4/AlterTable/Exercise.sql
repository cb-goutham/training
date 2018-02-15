create table students_summary(
	student_id BIGINT(19) NOT NULL  ,
	student_name VARCHAR(100), 
	year int(11),
	percentage FLOAT(10,2),
	no_of_medals_received  INT(5),
	FOREIGN KEY (student_id) REFERENCES students(id)
);


insert into students_summary select s.id,s.name,s.year,annual_per,
(SELECT count(medal_won) FROM medals WHERE medals.student_id = s.id AND medals.year = s.year) as medals  
from 
(select students.id,name,year ,sum(annual)/5 as annual_per from students inner join marks on student_id = students.id group by name,year) as s 
left join medals on s.id = student_id group by name ,year;