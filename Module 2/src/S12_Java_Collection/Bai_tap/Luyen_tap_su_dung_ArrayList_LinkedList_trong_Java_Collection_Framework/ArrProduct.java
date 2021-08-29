package S12_Java_Collection.Bai_tap.Luyen_tap_su_dung_ArrayList_LinkedList_trong_Java_Collection_Framework;

public class ArrProduct {
    public String id;
    public String name_product;
    public double price;
    public String date;

    ArrProduct(){
    }
    ArrProduct(String id, String name_product, double price, String date){
        this.id = id;
        this.name_product = name_product;
        this.price = price;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
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
}
