package ORG.EXAMPLE.utils;

import ORG.EXAMPLE.model.Product;
import ORG.EXAMPLE.repository.ProductRepository;

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
