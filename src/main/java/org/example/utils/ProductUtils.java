package org.example.utils;

import org.example.repository.ProductRepository;
import org.example.model.Product;

import java.util.List;
import java.util.Map;

public class ProductUtils {
    private final ProductRepository repository;

    public ProductUtils(Map<Long, Product> storage) {
        this.repository = new ProductRepository(storage);
    }

    public void saveProduct(Product product){
        repository.save(product);
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

}
