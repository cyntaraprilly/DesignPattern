import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by ASUS on 6/8/2017.
 */
public class OfficeUtilities implements Item {
    Hashtable products = new Hashtable();

    public OfficeUtilities() {
        addItem("Snowman 0.5 Black", "Pen", 3000);
        addItem("Sinar Dunia" , "Book", 5000);
        addItem("Logitech", "Mouse", 100000);
    }

    public void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);
        products.put(product.getName(), product);
    }


    @Override
    public Iterator createIterator() {
        return products.values().iterator();
    }
}
