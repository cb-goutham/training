alter table marks 
add column created_at datetime DEFAULT now(), 
add column updated_at datetime DEFAULT now();

alter table students
add column created_at datetime DEFAULT now(), 
add column updated_at datetime DEFAULT now();

alter table medals
add column created_at datetime DEFAULT now(), 
add column updated_at datetime DEFAULT now();

update marks
set quarterly = ifnull(quarterly,0),
half_yearly = ifnull(half_yearly,0),
annual = ifnull(annual,0);

alter table marks
modify column quarterly INT(11) NOT NULL,
modify column half_yearly INT(11) NOT NULL,
modify column annual INT(11) NOT NULL;

update marks
set updated_at = now();

update students 
set updated_at = now();

update medals 
set updated_at = now();



