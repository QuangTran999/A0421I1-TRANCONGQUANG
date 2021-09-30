package S19_CaseStudy.models;

public class Booking {
    public int idBooking;
    public String startTime;
    public String endTime;
    public int idCustumer;
    public String serviceName;
    public String serviceType;

    public Booking(int id, String startTime, String endTime, Customer customer, Facility facility){
    }

    public Booking(int idBooking, String startTime, String endTime, int idCustumer, String serviceName, String serviceType) {
        this.idBooking = idBooking;
        this.startTime = startTime;
        this.endTime = endTime;
        this.idCustumer = idCustumer;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getIdCustumer() {
        return idCustumer;
    }

    public void setIdCustumer(int idCustumer) {
        this.idCustumer = idCustumer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
