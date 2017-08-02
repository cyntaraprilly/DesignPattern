import java.util.*;

/**
 * Created by ASUS on 6/7/2017.
 */
public class ProductController {
    List<Item> items;

    public ProductController(List<Item> items) {
        this.items = items;
    }

    public void printProducts() {
        Iterator itemIterator = items.iterator();
        while (itemIterator.hasNext()) {
           Item item = (Item)itemIterator.next();
           System.out.println(item.getClass().getSimpleName());
           printItem(item.createIterator());
           System.out.println();
        }
    }

    private void printItem(Iterator iterator) {
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.println("Name: " + product.getName()
                    + " // " + product.getDescription()
                    + " // Price: Rp. " + product.getPrice());
        }
    }
}
