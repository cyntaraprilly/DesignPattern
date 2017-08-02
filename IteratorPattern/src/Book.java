import java.util.*;
import java.util.Iterator;

/**
 * Created by Cyntara on 6/7/2017.
 */
public class Book implements Item {
    List productList;

    public Book() {
        productList = new ArrayList();

        addProduct("Big Java", "Java programming book", 450000);
        addProduct("Discrete Math", "Math for University", 350000);
        addProduct("The Hunger Games", "Novel", 150000);

    }

    public void addProduct (String name, String description, double price) {
        Product product = new Product(name, description, price);
        productList.add(product);
    }


    @Override
    public Iterator createIterator() {
        return productList.iterator();
    }

}
