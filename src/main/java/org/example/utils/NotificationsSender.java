package org.example.utils;

import org.example.model.NotifiableProduct;
import org.example.model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class NotificationsSender {


    public void sendNotifications(List<Product> storage){
        List<NotifiableProduct> notifiableProducts = storage.stream()
                .filter(it -> it instanceof NotifiableProduct).map(it -> (NotifiableProduct) it).collect(Collectors.toList());
        for (NotifiableProduct product : notifiableProducts) {
            System.out.println(product.generateAddressForNotification());
        }
    }
}
