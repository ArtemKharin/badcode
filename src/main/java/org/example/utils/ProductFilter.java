package org.example.utils;

import org.example.model.NotifiableProduct;
import org.example.model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {

    public int filterNotifiableProducts(List<Product> storage) {
        List<NotifiableProduct> products = storage.stream().filter(it -> it instanceof NotifiableProduct).map(it -> (NotifiableProduct) it).collect(Collectors.toList());
        return products.size();
    }

}
