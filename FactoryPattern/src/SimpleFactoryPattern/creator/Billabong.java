package SimpleFactoryPattern.creator;

import SimpleFactoryPattern.product.BillabongShirt;
import SimpleFactoryPattern.product.BillabongTshirt;
import SimpleFactoryPattern.product.Clothes;

/**
 * Created by cyntara on 4/12/17.
 */
public class Billabong extends ClothingStore {
    @Override
    protected Clothes createItem(String type) {
        if (type.equals("Tshirt")) {
            return new BillabongTshirt();
        } else if (type.equals("Shirt")) {
            return new BillabongShirt();
        }

        return null;
    }
}

