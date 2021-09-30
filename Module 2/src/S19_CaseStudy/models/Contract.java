package S19_CaseStudy.models;

public class Contract {
    public int contractsNumber;
    public String idBooking;
    public int deposits;
    public int totalPayment;
    public String idCustomer;

    Contract(){
    }

    public Contract(int contractsNumber, String idBooking, int manyDeposit, int totalPayment, String idCustomer) {
        this.contractsNumber = contractsNumber;
        this.idBooking = idBooking;
        this.deposits = manyDeposit;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public int getContractsNumber() {
        return contractsNumber;
    }

    public void setContractsNumber(int contractsNumber) {
        this.contractsNumber = contractsNumber;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getManyDeposit() {
        return deposits;
    }

    public void setManyDeposit(int manyDeposit) {
        this.deposits = manyDeposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }
}
