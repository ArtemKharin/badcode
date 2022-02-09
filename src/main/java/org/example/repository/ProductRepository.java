package org.example.repository;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private final Map<Long, Product> storage;

    public ProductRepository(Map<Long, Product> storage) {
        this.storage = storage;
    }

    public Product save(Product product) {
        return storage.put(product.getId(), product);
    }

    public List<Product> getAll() {
        return new ArrayList<>(storage.values());
    }
}
