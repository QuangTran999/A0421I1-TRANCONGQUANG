package S19_CaseStudy.models;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    Villa(){
    }


    public Villa(String serviceName, double usableArea, int rentalCosts, int maxNumberOfPeople,
                 String rentalType, String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
