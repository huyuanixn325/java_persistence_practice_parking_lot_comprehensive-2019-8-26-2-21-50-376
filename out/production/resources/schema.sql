CREATE TABLE  employee (
  employeeID int PRIMARY KEY,
  employeeName VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);

CREATE TABLE parking_lot(
parkingLotID int not null primary key ,
capatity int not null,
availablePositionCount int not null,
employeeID int not null
);
ALTER TABLE parking_lot ADD CONSTRAINT FK_employee FOREIGN KEY(employeeID) REFERENCES employee(employeeID);