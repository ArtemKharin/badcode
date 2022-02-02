package ORG.EXAMPLE.utils;

import ORG.EXAMPLE.moDEL.NotifiableProduct;
import ORG.EXAMPLE.moDEL.Product;
import ORG.EXAMPLE.repository.ProductRepository;

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