package org.example;

import org.example.utils.ProductFilter;
import org.example.utils.ProductUtils;
import org.example.model.Product;
import org.example.utils.NotificationsSender;
import org.example.utils.ProductGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ProductUtils utils = new ProductUtils(new HashMap<>());
        ProductGenerator productGenerator = new ProductGenerator();
        ProductFilter productFilter = new ProductFilter();
        NotificationsSender notificationsSender =  new NotificationsSender();
        List<Product> products = new ArrayList<>();
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.forEach(utils::saveProduct);

        System.out.println(utils.getAll());
        System.out.println("notifiable products quantity: " + productFilter.filterNotifiableProducts(utils.getAll()));
        notificationsSender.sendNotifications(utils.getAll());
    }
}
