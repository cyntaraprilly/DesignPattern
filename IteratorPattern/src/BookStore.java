import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 6/7/2017.
 */
public class BookStore {
    public static void main(String[] args) {
        List<Item> items = new ArrayList();
        items.add(new Book());
        items.add(new CD());
        items.add(new OfficeUtilities());

        ProductController productController = new ProductController(items);
        productController.printProducts();
    }

}
