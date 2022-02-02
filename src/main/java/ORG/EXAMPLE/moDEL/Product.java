package ORG.EXAMPLE.moDEL;

import lombok.Data;

@Data
public abstract class Product implements BasicInfo {
    protected long id;
    protected boolean available;
    protected String title;
    protected double price;
    protected String channel;

    public String getBasicInfo() {
        return "Product{" +
                "id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}