package ORG.EXAMPLE.utils;

import ORG.EXAMPLE.moDEL.NotifiableProduct;
import ORG.EXAMPLE.moDEL.ProductBundle;
import ORG.EXAMPLE.repository.ProductRepository;

public class ProductSaver {

    public void saveNotifiableProduct(NotifiableProduct product, ProductRepository repository) {
        repository.save(product);
    }

    public void saveProductBundle(ProductBundle product, ProductRepository repository) {
        repository.save(product);
    }
}
