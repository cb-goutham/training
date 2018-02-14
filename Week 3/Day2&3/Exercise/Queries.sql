select * from Trains;

select o.StationCode as Origin,d.StationCode as Destination ,DistanceInKms from Stations o , Stations d,Routes where ((OriginStationId=o.StationId and DestinationStationId = d.StationId ));

select TrainName,sum(NoOfSeats) as NoOfSeats from Trains inner join TrainCoaches on Trains.TrainNo = TrainCoaches.TrainNo group by TrainCoaches.TrainNo;

select o.StationCode as Origin,d.StationCode as Destination,DistanceInKms from Stations o , Stations d,Routes where (OriginStationId=o.StationId and DestinationStationId = d.StationId and d.StationCode="BAN-YS" );

select o.StationCode as Origin,d.StationCode as Destination,DistanceInKms from Stations o , Stations d,Routes where (OriginStationId=o.StationId and DestinationStationId = d.StationId and (o.StationCode="BAN-YS" or o.StationCode="CBE-JN" or o.StationCode="MAS"));

select BookingRefNo, (select TrainName from Trains where Bookings.TrainNo=Trains.TrainNo) as TrainName,s.StationCode,d.StationCode,CoachCode,DateOfBooking,DateOfJourney,NoOfTickets from Bookings inner join Routes on Bookings.RouteId=Routes.RouteId , Stations s ,Stations d  where (OriginStationId=s.StationId and DestinationStationId = d.StationId and DateOfBooking between "2005/01/01" and "2005/12/31");

select * from Trains where TrainName like "B%";

select BookingRefNo, (select TrainName from Trains where Bookings.TrainNo=Trains.TrainNo) as TrainName,s.StationCode,d.StationCode,CoachCode,DateOfBooking,DateOfJourney,NoOfTickets from Bookings inner join Routes on Bookings.RouteId=Routes.RouteId , Stations s ,Stations d  where (OriginStationId=s.StationId and DestinationStationId = d.StationId and DateOfBooking is not null);

select BookingRefNo, (select TrainName from Trains where Bookings.TrainNo=Trains.TrainNo) as TrainName,s.StationCode,d.StationCode,CoachCode,DateOfBooking,DateOfJourney,NoOfTickets from Bookings inner join Routes on Bookings.RouteId=Routes.RouteId , Stations s ,Stations d  where (OriginStationId=s.StationId and DestinationStationId = d.StationId and year(DateOfBooking) = 2006 and year(DateOfJourney)=2007 );

select TrainName,count(TrainCoaches.TrainNo) as NoOfCoaches from Trains inner join TrainCoaches on Trains.TrainNo = TrainCoaches.TrainNo group by TrainCoaches.TrainNo;

select TrainName,count(Bookings.TrainNo) as NoOfBookings from Bookings inner join Trains on Trains.TrainNo = Bookings.TrainNo group by Bookings.TrainNo having Bookings.TrainNo = 10001;

select TrainName,sum(NoOfTickets) as TotalTickets from Bookings inner join Trains on Trains.TrainNo = Bookings.TrainNo group by Bookings.TrainNo having Bookings.TrainNo = 10001;

select o.StationCode as Origin,d.StationCode as Destination,DistanceInKms from Stations o , Stations d,Routes where (OriginStationId=o.StationId and DestinationStationId = d.StationId and DistanceInKms = (select min(DistanceInKms) from Routes ));

select TrainName,sum(NoOfTickets) as TotalTickets from Bookings right join Trains on Trains.TrainNo = Bookings.TrainNo group by Bookings.TrainNo ;

select CoachCode,50*(CostPerKm) as CostFor_50Kms from Coaches;

select (select TrainName from Trains where Trains.TrainNo = TrainRouteMaps.TrainNo) as TrainName,DepartureTime from TrainRouteMaps natural join (select RouteId from Stations o , Stations d,Routes where (OriginStationId=o.StationId and DestinationStationId = d.StationId and o.StationCode="BAN-YS" )) as Route1;

select TrainName,sum(NoOfTickets) as TotalTickets from Bookings inner join Trains on Trains.TrainNo = Bookings.TrainNo group by Bookings.TrainNo having TotalTickets > 500;

select TrainName,sum(NoOfTickets) as TotalTickets from Bookings inner join Trains on Trains.TrainNo = Bookings.TrainNo group by Bookings.TrainNo having TotalTickets < 50;

select BookingRefNo,(select TrainName from Trains where Trains.TrainNo = Bookings.TrainNo) as TrainName,CoachCode,(select StationCode from Stations where OriginStationId = StationId) as OriginStation ,(select StationCode from Stations where DestinationStationId = StationId) as DestinationStation ,DateOfJourney from Bookings natural join Routes where DateOfJourney > '2005/02/25';

select TrainName from TrainRouteMaps,Trains where RouteID = (select RouteID from Stations o , Stations d,Routes where (OriginStationId=o.StationId and DestinationStationId = d.StationId and o.StationCode="BAN-YS" and d.StationCode = "MAS") and Trains.TrainNo = TrainRouteMaps.TrainNo);

select * from Bookings natural join Trains;





