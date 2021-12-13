package model.bean;

public class Product {
    private int category_id;
    private String category_name;
    private int product_id;
    private String product_name;
    private int price;
    private int quantity;
    private String color;

    Product(){
    }

    public Product(int category_id, String category_name, int product_id, String product_name, int price, int quantity, String color) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
