package ORG.EXAMPLE;

import ORG.EXAMPLE.model.Product;
import ORG.EXAMPLE.utils.ProductFilter;
import ORG.EXAMPLE.utils.ProductGenerator;
import ORG.EXAMPLE.utils.ProductUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ProductUtils utils = new ProductUtils(new HashMap<>());
        ProductGenerator productGenerator = new ProductGenerator();
        ProductFilter productFilter = new ProductFilter(new HashMap<>());
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
        System.out.println("notifications sent: " + productFilter.filterNotifiableProductsAndSendNotifications());
    }
}
