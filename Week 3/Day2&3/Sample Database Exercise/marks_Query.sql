select * from marks where annual is NULL;
select student_id,subject_id,year from marks where annual is null and year=2005;
select student_id,subject_id,year from marks where annual is not null or quarterly is not null or half_yearly is not null;
select student_id,subject_id,year,quarterly,half_yearly,annual from marks where quarterly > 90 and half_yearly > 90 and annual > 90;
select subject_id,year,avg((quarterly + half_yearly + annual)/3) as average from marks group by subject_id,year;
select subject_id,year,avg((quarterly + half_yearly + annual)/3) as average from marks  where year = 2003 or year = 2004 group by subject_id,year;