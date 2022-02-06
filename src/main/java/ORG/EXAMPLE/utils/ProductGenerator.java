package ORG.EXAMPLE.utils;

import ORG.EXAMPLE.model.NotifiableProduct;
import ORG.EXAMPLE.model.Product;
import ORG.EXAMPLE.model.ProductBundle;

import java.util.Random;

public class ProductGenerator {
    public Product generateRandomProduct() {
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
