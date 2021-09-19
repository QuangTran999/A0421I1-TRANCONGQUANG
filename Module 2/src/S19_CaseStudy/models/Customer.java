package S19_CaseStudy.models;

public class Customer extends Person{
    private String customerClassification;
    private String address;

    Customer(){
    }

    public Customer(String customerClassification, String address) {
        this.customerClassification = customerClassification;
        this.address = address;
    }

    public Customer(String id, String name, String birthday, String sex, String idCard, String phoneNumber, String email, String customerClassification, String address) {
        super(id, name, birthday, sex, idCard, phoneNumber, email);
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
}
