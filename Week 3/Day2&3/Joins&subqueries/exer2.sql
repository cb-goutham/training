select name from marks inner join students on student_id = students.id where (annual is null and quarterly is null and half_yearly is null);
select name,sum(IFNULL(annual,0)) as marks,year from marks inner join students on student_id = students.id group by name,year;
select name,sum(IFNULL(quarterly,0)) as total ,grade from marks inner join students on student_id=students.id group by name,year having year = 2003;
select name,grade,count(medal_won) as no_of_medals from medals inner join students on student_id= students.id where grade = 9 or grade = 10 group by name having no_of_medals > 3;
select name,grade,count(medal_won) as no_of_medals from students left join medals on student_id = students.id group by name having no_of_medals < 2;

select name,s.year from 
(select student_id,name , year from students inner join marks on student_id = students.id where annual > 30 group by name,year having count(annual)=5) as s 
left join medals on medals.student_id = s.student_id group by name,year having count(medal_won) =0;



select name,game_id,count(medal_won) as medal_won ,year,grade from students inner join medals on students.id = medals.student_id group by name,year,grade having count(medal_won) > 3;



select s.name,
(SELECT count(medal_won) FROM medals WHERE medals.student_id = s.id AND medals.year = s.year) as medals 
,quarterly_per,half_yearly_per,annual_per,s.year from 
(select students.id,name,year ,sum(annual)/5 as annual_per,sum(quarterly)/5 as quarterly_per,sum(half_yearly)/5 as half_yearly_per from students inner join marks on student_id = students.id group by name,year) as s 
left join medals on s.id = student_id group by name ,year;



select name, if(sum(quarterly)>=450&&sum(quarterly<=500),"S",if(sum(quarterly)>=400&&sum(quarterly)<450,"A",if(sum(quarterly)>=350&&sum(quarterly)<400,"B",if(sum(quarterly)>=300&&sum(quarterly)<350,"C",if(sum(quarterly)>=250&&sum(quarterly)<300,"D",if(sum(quarterly)>=200&&sum(quarterly)<250,"E","F")))))) as quarterly_rating,
if(sum(half_yearly)>=450&&sum(half_yearly<=500),"S",if(sum(half_yearly)>=400&&sum(half_yearly)<450,"A",if(sum(half_yearly)>=350&&sum(half_yearly)<400,"B",if(sum(half_yearly)>=300&&sum(half_yearly)<350,"C",if(sum(half_yearly)>=250&&sum(half_yearly)<300,"D",if(sum(half_yearly)>=200&&sum(half_yearly)<250,"E","F")))))) as half_yearly_rating,
if(sum(annual)>=450&&sum(annual<=500),"S",if(sum(annual)>=400&&sum(annual)<450,"A",if(sum(annual)>=350&&sum(annual)<400,"B",if(sum(annual)>=300&&sum(annual)<350,"C",if(sum(annual)>=250&&sum(annual)<300,"D",if(sum(annual)>=200&&sum(annual)<250,"E","F")))))) as annual_rating
,year,grade from students inner join marks on students.id = student_id group by name , year,grade;