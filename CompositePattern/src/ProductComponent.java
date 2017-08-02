/**
 * Created by ASUS on 6/8/2017.
 */
public abstract class ProductComponent {
    public void add(ProductComponent productComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(ProductComponent productComponent) {
        throw new UnsupportedOperationException();
    }

    public ProductComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
