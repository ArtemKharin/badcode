package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class NotifiableProduct extends Product implements Notifiable{
    protected String channel;

    @Override
    public String generateAddressForNotification() {
        return "somerandommail@gmail.com";
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
