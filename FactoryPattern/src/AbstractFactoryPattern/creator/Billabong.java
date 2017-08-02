package AbstractFactoryPattern.creator;

import AbstractFactoryPattern.materialfactory.BillabongMaterialFactory;
import AbstractFactoryPattern.materialfactory.MaterialFactory;
import AbstractFactoryPattern.product.Clothes;
import AbstractFactoryPattern.product.Shirt;
import AbstractFactoryPattern.product.Tshirt;

/**
 * Created by cyntara on 4/12/17.
 */
public class Billabong extends ClothingStore {
    @Override
    protected Clothes createItem(String type) {
        Clothes clothes = null;
        MaterialFactory materialFactory = new BillabongMaterialFactory();

        if (type.equals("Tshirt")) {
            clothes = new Tshirt(materialFactory);
            clothes.setName("Billabong Jacket");
            clothes.setDiscount(20);
        } else if (type.equals("Shirt")) {
            clothes = new Shirt(materialFactory);
            clothes.setName("Billabong Shirt");
            clothes.setDiscount(0);
        }

        return clothes;
    }
}

