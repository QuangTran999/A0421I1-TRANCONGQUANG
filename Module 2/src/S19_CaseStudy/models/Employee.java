package S19_CaseStudy.models;

public class Employee extends Person{
    private String level;
    private String location;
    private long wage;

    Employee(){
    }

    public Employee(String level, String location, long wage) {
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee(String id, String name, String birthday, String sex, String idCard, String phoneNumber, String email, String level, String location, long wage) {
        super(id, name, birthday, sex, idCard, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getWage() {
        return wage;
    }

    public void setWage(long wage) {
        this.wage = wage;
    }
}
