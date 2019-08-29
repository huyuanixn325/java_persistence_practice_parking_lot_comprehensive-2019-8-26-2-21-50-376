package tws.entity;

public class ParkingLot {
    private int parkingLotID;
    private int capacity;
    private int availablePositionCount;
    private int employeeID;

    public ParkingLot() {
    }

    public ParkingLot(int parkingLotID, int capacity, int availablePositionCount, int employeeID) {
        this.parkingLotID = parkingLotID;
        this.capacity = capacity;
        this.availablePositionCount = availablePositionCount;
        this.employeeID = employeeID;
    }

    public int getParkingLotID() {
        return parkingLotID;
    }

    public void setParkingLotID(int parkingLotID) {
        this.parkingLotID = parkingLotID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailablePositionCount() {
        return availablePositionCount;
    }

    public void setAvailablePositionCount(int availablePositionCount) {
        this.availablePositionCount = availablePositionCount;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
