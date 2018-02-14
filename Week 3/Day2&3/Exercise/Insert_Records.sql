insert into Trains values(10000,"shadabpti Express");
insert into Trains values(10001,"Nilgiris Express");
insert into Trains values(10002,"RajDhani Express");

insert into Stations values(100,"MAS");
insert into Stations values(101,"CBE-JN");
insert into Stations values(102,"BAN-YS");


insert into Routes values(1001,100,101,480);
insert into Routes values(1002,102,100,500);
insert into Routes values(1003,101,102,400);

insert into Coaches values("SL",0.65);
insert into Coaches values("AC 3",1.2);
insert into Coaches values("AC 2",1.75);

insert into TrainCoaches values(10001,"SL",500);
insert into TrainCoaches values(10001,"AC 3",300);
insert into TrainCoaches values(10001,"AC 2",100);	
insert into TrainCoaches values(10002,"SL",0);
insert into TrainCoaches values(10002,"AC 3",700);
insert into TrainCoaches values(10002,"AC 2",300);
insert into TrainCoaches values(10000,"SL",50);
insert into TrainCoaches values(10000,"AC 3",800);
insert into TrainCoaches values(10000,"AC 2",500);	

insert into TrainRouteMaps values(1001,10001,"05:00","21:00",480);
insert into TrainRouteMaps values(1002,10000,"06:30","12:30",360);
insert into TrainRouteMaps values(1003,10002,"13:00","20:30",450);

insert into Bookings values (11100,1001,10001,"SL",'2005/04/13',"2005/01/12",3);
insert into Bookings values(11101,1002,10002,"AC 2","2007/01/25","2006/11/11",2);
insert into Bookings values(11102,1001,10001,"AC 3",'2005/06/13','2005/12/31',4);	


insert into Users values (10001,"john123","u cant c me");
insert into Users values (10002,"UnderTaker@123","Tombstone Piledriver");

