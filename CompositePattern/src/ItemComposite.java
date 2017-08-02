import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ASUS on 6/8/2017.
 */
public class ItemComposite extends ProductComponent {
    List<ProductComponent> productComponents = new ArrayList<>();
    String name;
    String description;

    public ItemComposite(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(ProductComponent productComponent) {
        productComponents.add(productComponent);
    }

    @Override
    public void remove(ProductComponent productComponent) {
        productComponents.remove(productComponent);
    }

    @Override
    public ProductComponent getChild(int i) {
        return (ProductComponent)productComponents.get(i);
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
    public void print() {
        System.out.println("\n" + getName() + "---" + getDescription());
        Iterator iterator = productComponents.iterator();
        while (iterator.hasNext()) {
            ProductComponent productComponent = (ProductComponent) iterator.next();
            productComponent.print();
        }
    }
}
