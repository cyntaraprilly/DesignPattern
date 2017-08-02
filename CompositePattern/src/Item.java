/**
 * Created by ASUS on 6/8/2017.
 */
public class Item extends ProductComponent{
    String name;
    String description;
    double price;

    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName()
                + " // " + getDescription()
                + " // Price: Rp. " + getPrice());
    }
}
