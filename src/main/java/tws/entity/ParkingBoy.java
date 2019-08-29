package tws.entity;

public class ParkingBoy {
    private int parkingBoyID;
    private String parkingBoyName;
    private int age;

    public ParkingBoy() {
    }

    public ParkingBoy(int parkingBoyID, String parkingBoyName, int age) {
        this.parkingBoyID = parkingBoyID;
        this.parkingBoyName = parkingBoyName;
        this.age = age;
    }

    public int getParkingBoyID() {
        return parkingBoyID;
    }

    public void setParkingBoyID(int parkingBoyID) {
        this.parkingBoyID = parkingBoyID;
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
                "parkingBoyID=" + parkingBoyID +
                ", parkingBoyName='" + parkingBoyName + '\'' +
                ", age=" + age +
                '}';
    }
}
