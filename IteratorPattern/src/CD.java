import java.util.Iterator;

/**
 * Created by ASUS on 6/7/2017.
 */
public class CD implements Item {
    final static int SIZE = 3;
    int numOfProduct = 0;
    Product[] products;

    public CD() {
        products = new Product[SIZE];

        addProduct("A Head Full Of Dreams", "Music Album", 300000);
        addProduct("Harry Potter", "Movie CD", 450000);
        addProduct("Programming Tutorial", "Learning CD", 50000);
    }

    public void addProduct(String name, String description, double price) {
        Product product = new Product(name, description, price);

        if (numOfProduct >= SIZE) {
            System.out.println("Cannot add more CD");
        } else {
            products[numOfProduct] = product;
            numOfProduct++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new CDIterator(products);
    }
}
