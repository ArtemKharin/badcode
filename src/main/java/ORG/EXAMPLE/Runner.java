package ORG.EXAMPLE;

import ORG.EXAMPLE.moDEL.NotifiableProduct;
import ORG.EXAMPLE.moDEL.Product;
import ORG.EXAMPLE.moDEL.ProductBundle;
import ORG.EXAMPLE.repository.ProductRepository;
import ORG.EXAMPLE.utils.*;

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