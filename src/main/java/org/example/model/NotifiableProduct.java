package org.example.model;

import org.example.interfaces.ProductAddressGeneratorForNotification;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NotifiableProduct extends Product implements ProductAddressGeneratorForNotification {
    private  static int counter = 1;
    private String channel;


    @Override
    public String generateAddressForNotification() {
        return "somerandommail" + counter++ +"@gmail.com";
    }

    @Override
    public String getBasicInfo() {
        return "NotifiableProduct{" +
                "channel='" + channel + '\'' +
                ", id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
