package org.example.repository;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private Map<Long, Product> storage = new HashMap<>();

    public void saveProduct (Product product) {
        storage.put(product.getId(), product);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(storage.values());
    }
}
