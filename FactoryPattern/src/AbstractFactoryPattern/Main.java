package AbstractFactoryPattern;

import AbstractFactoryPattern.creator.Billabong;
import AbstractFactoryPattern.creator.ClothingStore;
import AbstractFactoryPattern.creator.Zara;

/**
 * Created by cyntara on 4/12/17.
 */
public class Main {
    public static void main(String[] args) {
        ClothingStore clothingStore;

        //get information for brand Billabong, type Jacket
        clothingStore = new Billabong();
        clothingStore.buyProduct("Tshirt");

        System.out.println();

        //get information for brand Zara, type Shirt
        clothingStore = new Zara();
        clothingStore.buyProduct("Shirt");
    }
}
