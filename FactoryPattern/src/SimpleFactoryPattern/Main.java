package SimpleFactoryPattern;

import SimpleFactoryPattern.creator.Billabong;
import SimpleFactoryPattern.creator.ClothingStore;
import SimpleFactoryPattern.creator.Zara;
import SimpleFactoryPattern.product.Clothes;

/**
 * Created by cyntara on 4/12/17.
 */
public class Main {
    public static void main(String[] args) {

        ClothingStore ZaraBrand = new Zara();
        ClothingStore billabongBrand = new Billabong();

        Clothes clothes = ZaraBrand.buyProduct("Shirt");
        System.out.println(clothes.getName() + " information is succesfully retrieved\n");

        clothes = billabongBrand.buyProduct("Tshirt");
        System.out.println(clothes.getName() + " information is succesfully retrieved\n");

        clothes = ZaraBrand.buyProduct("Tshirt");
        System.out.println(clothes.getName() + " information is succesfully retrieved\n");
    }
}

