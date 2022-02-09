package org.example;

import org.example.model.NotifiableProduct;
import org.example.model.Product;
import org.example.model.ProductBundle;
import org.example.repository.ProductRepository;
import org.example.utils.ProductGenerator;
import org.example.utils.ProductGet;
import org.example.utils.ProductSaver;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        ProductGenerator productGenerator = new ProductGenerator();
        ProductSaver saver = new ProductSaver();
        ProductGet productGet = new ProductGet();
        List<Product> products = new ArrayList<>();
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.add(productGenerator.generateRandomProduct());
        products.forEach(it -> {
            if (it instanceof ProductBundle) {
                saver.saveProductBundle((ProductBundle) it, repository);
            } else if (it instanceof NotifiableProduct) {
                saver.saveNotifiableProduct((NotifiableProduct) it, repository);
            }
        });

        System.out.println(productGet.getAll(repository));
        System.out.println("notifications sent: " + productGet.sendNotifications(productGet.getListNotifiableProduct(repository)));
    }
}