package AbstractFactoryPattern.creator;

import AbstractFactoryPattern.materialfactory.MaterialFactory;
import AbstractFactoryPattern.materialfactory.ZaraMaterialFactory;
import AbstractFactoryPattern.product.Clothes;
import AbstractFactoryPattern.product.Shirt;
import AbstractFactoryPattern.product.Tshirt;

/**
 * Created by cyntara on 4/12/17.
 */
public class Zara extends ClothingStore {

    @Override
    protected Clothes createItem(String type) {
        Clothes clothes = null;
        MaterialFactory materialFactory = new ZaraMaterialFactory();

        if (type.equals("Tshirt")) {
            clothes = new Tshirt(materialFactory);
            clothes.setName("Zara Tshirt");
            clothes.setDiscount(30);
        } else if (type.equals("Shirt")) {
            clothes = new Shirt(materialFactory);
            clothes.setName("Zara shirt");
            clothes.setDiscount(40);
        }
        return clothes;
    }
}

