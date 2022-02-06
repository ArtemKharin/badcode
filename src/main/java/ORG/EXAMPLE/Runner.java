package org.example;


import org.example.model.NotifiableProduct;
import org.example.model.Product;
import org.example.model.ProductBundle;
import org.example.utils.ProductUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        ProductUtils service = new ProductUtils();
        List<Product> products = new ArrayList<>();
        products.add(generateRandomProduct());
        products.add(generateRandomProduct());
        products.add(generateRandomProduct());
        products.add(generateRandomProduct());
        products.add(generateRandomProduct());
        products.add(generateRandomProduct());
        products.add(generateRandomProduct());
        products.forEach(service::saveProduct);

        service.getAllProducts().forEach(product -> System.out.print(product + "\n"));
        System.out.println("notifications sent: " + service.sendNotifications(service.getNotifiableProducts()));
    }

    public static Product generateRandomProduct() {
        Random random = new Random();
        if (random.nextBoolean()) {
            ProductBundle productBundle = new ProductBundle();
            productBundle.setAmount(random.nextInt(15));
            productBundle.setAvailable(random.nextBoolean());
            productBundle.setPrice(random.nextDouble());
            productBundle.setId(random.nextLong());
            productBundle.setTitle(random.nextFloat() + "" + random.nextDouble());
            return productBundle;
        } else {
            NotifiableProduct product = new NotifiableProduct();
            product.setId(random.nextLong());
            product.setTitle(random.nextFloat() + "" + random.nextDouble());
            product.setAvailable(random.nextBoolean());
            product.setChannel(random.nextBoolean() + "" + random.nextDouble());
            product.setPrice(random.nextDouble());
            return product;
        }
    }
}