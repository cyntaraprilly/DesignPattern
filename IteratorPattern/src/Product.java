/**
 * Created by Cyntara on 6/7/2017.
 */
public class Product {
    String name;
    String description;
    double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
