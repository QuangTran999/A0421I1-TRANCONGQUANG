package S12_Java_Collection.Bai_tap.Luyen_tap_su_dung_ArrayList_LinkedList_trong_Java_Collection_Framework;

public  class ArrProduct {
    public String id;
    public String nameProduct;
    public double price;
    public String date;

    ArrProduct(){
    }
    ArrProduct(String id, String nameProduct, double price, String date){
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "ID: "+getId() + " Name: " + getNameProduct() + " Price: "+getPrice()+" Date: "+getDate();
    }
}
