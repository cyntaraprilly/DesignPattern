/**
 * Created by cyntara on 3/16/17.
 */
public class Main {
    public static void main(String[] args) {
        Rice rice = new FriedRice();
        System.out.println(rice.getName() + " : Rp. " + rice.getFinalPrice());

        Rice anotherRice = new YellowRice();
        anotherRice = new ChickenDecorator(anotherRice);
        System.out.println(anotherRice.getName() + " : Rp. " + anotherRice.getFinalPrice());

        Rice anotherRice2 = new FriedRice();
        anotherRice2 = new FishDecorator(anotherRice2);
        anotherRice2 = new ChiliDecorator(anotherRice2);
        System.out.println(anotherRice2.getName() + " : Rp. " + anotherRice2.getFinalPrice());

        Rice nasiGoreng = new FriedRice();
        nasiGoreng = new ChiliDecorator(nasiGoreng);
        nasiGoreng = new FishDecorator(nasiGoreng);
        nasiGoreng = new ChickenDecorator(nasiGoreng);
        System.out.println(nasiGoreng.getName() + " : Rp. " + nasiGoreng.getFinalPrice());
    }

}
