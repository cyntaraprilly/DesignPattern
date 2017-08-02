package AbstractFactoryPattern.product;

import AbstractFactoryPattern.materialfactory.Fabric;
import AbstractFactoryPattern.materialfactory.Sleeve;

/**
 * Created by cyntara on 4/12/17.
 */
public abstract class Clothes {
    protected String name;

    protected int discount;

    protected Fabric fabric;

    protected Sleeve sleeve;


    public abstract void getItemInformation();

    public void getDeliveryFee() {
        System.out.println("Delivery fee: 10.000");
    }

    public void getEstimatedArrivalTime() {
        System.out.println("Estimated arrival time: 1 week");
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDiscount(int discount){
        this.discount = discount;
    }

    public void getDiscount() {
        System.out.println("By purchasing " + name + " you get " + discount + " percent off");
    }
}

