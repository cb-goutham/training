create table Trains(
	TrainNo INT(5) PRIMARY KEY NOT NULL,
	TrainName VARCHAR(25)
);

create table Stations(
	StationId INT(5) PRIMARY KEY NOT NULL,
	StationCode VARCHAR(10)
);

create table Routes(
	RouteId INT(5) PRIMARY KEY NOT NULL,
	OriginStationId INT(5),
	DestinationStationId INT(5),
	DistanceInKms INT(10),
	FOREIGN KEY (OriginStationId) REFERENCES Stations(StationId),
	FOREIGN KEY (DestinationStationId) REFERENCES Stations(StationId)
);

create table TrainRouteMaps(
	RouteId INT(5) NOT NULL, 
	TrainNo INT(5) NOT NULL,
	ArrivalTime time,
	DepartureTime time,
	DurationInMins INT(5),
	PRIMARY KEY (RouteId,TrainNo),
	FOREIGN KEY (RouteId) REFERENCES Routes(RouteId),
	FOREIGN KEY (TrainNo) REFERENCES Trains(TrainNo)
);

create table Coaches(
	CoachCode VARCHAR(5) PRIMARY KEY NOT NULL,
	CostPerKm FLOAT(10,2) 
);

create table TrainCoaches(
	TrainNo INT(5),
	CoachCode VARCHAR(5),
	NoOfSeats INT(4),
	FOREIGN KEY (TrainNo) REFERENCES Trains(TrainNo),
	FOREIGN KEY (CoachCode) REFERENCES Coaches(CoachCode)
);

create table Bookings(
	BookingRefNo INT(8) PRIMARY KEY NOT NULL,
	RouteId INT(5),
	TrainNo INT(5),
	CoachCode VARCHAR(5),
	DateOfJourney DATE,
	DateOfBooking DATE,
	NoOfTickets INT(3),
	FOREIGN KEY (RouteId) REFERENCES Routes(RouteId),
	FOREIGN KEY (TrainNo) REFERENCES Trains(TrainNo),
	FOREIGN KEY (CoachCode) REFERENCES Coaches(CoachCode)

);

create table Users(
	UserId INT(5) PRIMARY KEY NOT NULL,
	LoginId VARCHAR(25),
	LPassword VARCHAR(25)
);