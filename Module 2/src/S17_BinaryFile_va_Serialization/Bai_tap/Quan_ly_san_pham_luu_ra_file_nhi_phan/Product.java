package S17_BinaryFile_va_Serialization.Bai_tap.Quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;

    private String name;

    private String manufacturer;

    private int price;

    Product(){
    }

    public Product(int id, String name, String manufacturer, int price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + manufacturer + '\'' +
                ", address='" + price +
                '}';
    }


    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"SamSung A1", "SamSung", 12000));
        products.add(new Product(2,"SamSung A2", "SamSung", 13000));
        products.add(new Product(3,"SamSung A3", "SamSung", 14000));
        products.add(new Product(4,"SamSung A4", "SamSung", 15000));
        products.add(new Product(5,"SamSung A5", "SamSung", 16000));
        products.add(new Product(6,"SamSung A6", "SamSung", 17000));
        writeToFile("student.txt", products);
        List<Product> studentDataFromFile = readDataFromFile("student.txt");
        for (Product product : studentDataFromFile){
            System.out.println(product);
        }
    }
}
