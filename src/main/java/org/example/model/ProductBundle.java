package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class ProductBundle extends Product implements Bundler {
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