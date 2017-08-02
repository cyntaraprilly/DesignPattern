package SimpleFactoryPattern.creator;

import SimpleFactoryPattern.product.Clothes;

/**
 * Created by cyntara on 4/12/17.
 */
public abstract class ClothingStore {

    public Clothes buyProduct(String type) {

        Clothes clothes;

        clothes = createItem(type);
        clothes.getItemInformation();
        clothes.getEstimatedArrivalTime();
        clothes.getDeliveryFee();

        return clothes;
    }

    protected abstract Clothes createItem(String type);

}

