package tws.entity;

public class ParkingBoy {
    private int employeeID;
    private String parkingBoyName;
    private int age;

    public ParkingBoy() {
    }

    public ParkingBoy(int parkingBoyID, String parkingBoyName, int age) {
        this.employeeID = parkingBoyID;
        this.parkingBoyName = parkingBoyName;
        this.age = age;
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

    @Override
    public String toString() {
        return "ParkingBoy{" +
                "employeeID=" + employeeID +
                ", parkingBoyName='" + parkingBoyName + '\'' +
                ", age=" + age +
                '}';
    }
}
