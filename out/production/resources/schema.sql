CREATE TABLE  parking_boy (
  employeeID int PRIMARY KEY,
  parkingBoyName VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);

CREATE TABLE parking_lot(
parkingLotID int not null primary key ,
capacity int not null,
availablePositionCount int not null,
employeeID int not null
);
ALTER TABLE parking_lot ADD CONSTRAINT FK_parking_boy FOREIGN KEY(employeeID) REFERENCES parking_boy(employeeID);

