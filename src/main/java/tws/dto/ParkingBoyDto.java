package tws.dto;

import tws.entity.ParkingLot;

import java.io.Serializable;
import java.util.List;

public class ParkingBoyDto {
    private int employeeID;
    private String parkingBoyName;
    private int age;
    private List<ParkingLot> parkingLotList;

    public ParkingBoyDto() {
    }

    public ParkingBoyDto(int employeeID, String parkingBoyName, int age, List<ParkingLot> parkingLotList) {
        this.employeeID = employeeID;
        this.parkingBoyName = parkingBoyName;
        this.age = age;
        this.parkingLotList = parkingLotList;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getParkingBoyName() {
        return parkingBoyName;
    }

    public void setParkingBoyName(String parkingBoyName) {
        this.parkingBoyName = parkingBoyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", parkingBoyName='" + parkingBoyName + '\'' +
                ", age=" + age +
                ", parkingLotList=" + parkingLotList +
                '}';
    }
}
