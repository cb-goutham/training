alter table marks
add column average FLOAT(10,2);

update marks
set average = (annual+half_yearly+quarterly)/3;

CREATE TRIGGER update_avg
BEFORE UPDATE ON marks
for each row
set NEW.average = (NEW.annual+NEW.half_yearly+NEW.quarterly)/3,
new.updated_at = now() ;


CREATE TRIGGER insert_avg
BEFORE INSERT ON marks
for each row
set NEW.average = (NEW.annual+NEW.half_yearly+NEW.quarterly)/3,
new.created_at = now(),new.updated_at=now();


alter table medals
add column medal_received VARCHAR(10) ;
update medals
set medal_received = medal_won;


delimiter //
CREATE TRIGGER update_medals
BEFORE UPDATE ON medals
for each row
BEGIN
	IF (new.medal_won = old.medal_won) THEN
      SET new.medal_won = new.medal_received;
   ELSE
      SET new.medal_received = new.medal_won;
   END IF;
 END;
//
 delimiter ;


 delimiter //
CREATE TRIGGER insert_medals
BEFORE INSERT ON medals
for each row
BEGIN
	IF (new.medal_won = NULL) THEN
      SET new.medal_won = new.medal_received;
   ELSE
      SET new.medal_received = new.medal_won;
   END IF;
 END;
//
 delimiter ;




 alter table medal drop column medal_won;


