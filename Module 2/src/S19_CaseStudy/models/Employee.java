package S19_CaseStudy.models;

public class Employee extends Person{
    private String level;
    private String location;
    private int salary;

    Employee(){
    }

    public Employee(String level, String location, int salary) {
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(int id, String name, int age,
                    String sex, String idCard, String phoneNumber,
                    String email, String level, String location, int salary) {
        super(id, name, age, sex, idCard, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
