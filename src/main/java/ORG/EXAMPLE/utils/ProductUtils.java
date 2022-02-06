package org.example.utils;


import org.example.model.NotifiableProduct;
import org.example.model.Product;
import org.example.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;


public class ProductUtils {
    private final ProductRepository repository = new ProductRepository();

    public void saveProduct(Product product) {
        repository.saveProduct(product);
    }

    public List<Product> getAllProducts() {
        return repository.getAllProducts();
    }

    public List<NotifiableProduct> getNotifiableProducts() {
        List<NotifiableProduct> notifiableProducts = repository
                .getAllProducts()
                .stream()
                .filter(it -> it instanceof NotifiableProduct)
                .map(it -> (NotifiableProduct) it)
                .collect(Collectors.toList());
        return notifiableProducts;
    }

    public int sendNotifications(List<NotifiableProduct> notifiableProducts) {
        int notifications = 0;
        for (NotifiableProduct product : notifiableProducts) {
            //sending some notifications here
            notifications++;
        }
        return notifications;
    }
}

