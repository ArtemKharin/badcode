package ORG.EXAMPLE.model;

import ORG.EXAMPLE.interfaces.ProductAmountInBundle;
import lombok.Setter;

@Setter
public class ProductBundle extends Product implements ProductAmountInBundle {
    protected int amount;


    @Override
    public int getAmountInBundle() {
        return amount;
    }

    @Override
    public String getBasicInfo() {
        return "ProductBundle{" +
                ", id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", amountInBundle=" + amount +
                '}';
    }
}
