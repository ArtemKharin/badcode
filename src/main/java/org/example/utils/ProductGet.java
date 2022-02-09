package org.example.utils;

import org.example.model.NotifiableProduct;
import org.example.model.Product;
import org.example.repository.ProductRepository;

import java.util.List;

public class ProductGet {

    public List<NotifiableProduct> getListNotifiableProduct(ProductRepository repository) {
        return repository.getAll().
                stream().
                filter(it -> it instanceof NotifiableProduct).
                map(it -> (NotifiableProduct) it).
                toList();
    }

    public int sendNotifications(List<NotifiableProduct> productList) {
        int notifications = 0;
        for (NotifiableProduct product : productList) {
            //sending some notifications here
            notifications++;
        }
        return notifications;
    }

    public List<Product> getAll(ProductRepository repository) {
        return repository.getAll();
    }
}