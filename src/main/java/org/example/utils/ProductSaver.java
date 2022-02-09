package org.example.utils;

import org.example.model.NotifiableProduct;
import org.example.model.ProductBundle;
import org.example.repository.ProductRepository;

public class ProductSaver {

    public void saveNotifiableProduct(NotifiableProduct product, ProductRepository repository) {
        repository.save(product);
    }

    public void saveProductBundle(ProductBundle product, ProductRepository repository) {
        repository.save(product);
    }
}
