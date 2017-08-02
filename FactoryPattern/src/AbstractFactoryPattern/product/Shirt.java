package AbstractFactoryPattern.product;

import AbstractFactoryPattern.materialfactory.MaterialFactory;

/**
 * Created by cyntara on 4/12/17.
 */
public class Shirt extends Clothes {
    private MaterialFactory materialFactory;

    public Shirt(MaterialFactory materialFactory) {
        this.materialFactory = materialFactory;
    }

    @Override
    public void getItemInformation() {
        System.out.println("Getting information for: " +name);
        fabric = materialFactory.createFabric();
        sleeve = materialFactory.createSleeve();
    }
}

