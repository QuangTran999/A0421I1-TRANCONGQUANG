package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products = new HashMap<>();
    static {
        products.put(1,new Product(1,"Iphone X", 10000, "Good", "China"));
        products.put(2,new Product(2,"SamSung", 8000, "Pro", "Japan"));
        products.put(3,new Product(3,"Iphone XS", 12000, "Good", "VietNam"));
        products.put(4,new Product(4,"Iphone Nokia", 6000, "Good", "Koreo"));
        products.put(5,new Product(5,"Iphone Oppo", 10000, "Good", "China"));
        products.put(6,new Product(6,"Iphone Vivu", 12000, "Good", "Malaysia"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
}

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
