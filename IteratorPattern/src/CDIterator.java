import java.util.Iterator;

/**
 * Created by ASUS on 6/7/2017.
 */
public class CDIterator implements Iterator {
    Product[] products;
    int position = 0;

    public CDIterator(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        if (position >= products.length || products[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Product product = products[position];
        position++;
        return product;
    }
}
