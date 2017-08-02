package SimpleFactoryPattern.product;

/**
 * Created by cyntara on 4/12/17.
 */
public abstract class Clothes {

    protected String name;

    protected String discount;

    protected String fabric;

    protected String sleeves;


    public void getItemInformation() {
        System.out.println("Get information for: " + name);
        getFabric();
        getSleeve();
        getDiscount();
    }

    public void getDeliveryFee() {
        System.out.println("Delivery fee: 10.000");
    }

    public void getEstimatedArrivalTime() {
        System.out.println("Estimated arrival time: 1 week");
    }

    public String getName() {
        return name;
    }

    private void  getDiscount() {
        System.out.println("By purchasing " + name + " you get " + discount + " percent off");
    }

    private void getFabric() {
        System.out.println("This cloth use " +fabric + " as the material");
    }

    private void getSleeve() {
        System.out.println("Sleeve type: " +sleeves);
    }
}

