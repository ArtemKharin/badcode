package ORG.EXAMPLE.utils;

import ORG.EXAMPLE.model.NotifiableProduct;
import ORG.EXAMPLE.model.Product;
import ORG.EXAMPLE.repository.ProductRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductFilter {

    private final ProductRepository repository;

    public ProductFilter(Map<Long, Product> storage) {
        this.repository = new ProductRepository(storage);
    }
    public int filterNotifiableProductsAndSendNotifications() {
        List<NotifiableProduct> products = repository.getAll().stream().filter(it -> it instanceof NotifiableProduct).map(it -> (NotifiableProduct) it).collect(Collectors.toList());
        for (NotifiableProduct product : products) {
            product.generateAddressForNotification();
        }
        return products.size();
    }

}
