package S19_CaseStudy.models;

public class Customer extends Person{
    private String customerClassification;
    private String address;

    Customer(){
    }


    public Customer(int id, String name, int age, String sex, String idCard,
                    String phoneNumber, String email,
                    String customerClassification, String address) {
        super(id, name, age, sex, idCard, phoneNumber, email);
        this.customerClassification = customerClassification;
        this.address = address;
    }

    public String getCustomerClassification() {
        return customerClassification;
    }

    public void setCustomerClassification(String customerClassification) {
        this.customerClassification = customerClassification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerClassification='" + customerClassification + '\'' +
                ", address='" + address + '\'' +
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
