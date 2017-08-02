package AbstractFactoryPattern.product;

import AbstractFactoryPattern.materialfactory.MaterialFactory;

/**
 * Created by cyntara on 4/13/17.
 */
public class Tshirt extends Clothes {
    private MaterialFactory materialFactory;

    public Tshirt(MaterialFactory materialFactory) {
        this.materialFactory = materialFactory;
    }

    @Override
    public void getItemInformation() {
        System.out.println("Getting information for: " +name);
        fabric = materialFactory.createFabric();
        sleeve = materialFactory.createSleeve();
    }
}

