package SimpleFactoryPattern.creator;

import SimpleFactoryPattern.product.Clothes;
import SimpleFactoryPattern.product.ZaraShirt;
import SimpleFactoryPattern.product.ZaraTshirt;

/**
 * Created by cyntara on 4/12/17.
 */
public class Zara extends ClothingStore {

    @Override
    protected Clothes createItem(String type) {
        if (type.equals("Tshirt")) {
            return new ZaraTshirt();
        } else if (type.equals("Shirt")) {
            return new ZaraShirt();
        }

        return null;
    }
}

