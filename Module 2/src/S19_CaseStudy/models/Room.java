package S19_CaseStudy.models;

public class Room extends Facility{
    private String serviceFree;

    Room(){
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }
    public Room(String serviceName, double usableArea, int rentalCosts, int maxNumberOfPeople, String rentalType, String serviceFree) {
        super(serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }
}
