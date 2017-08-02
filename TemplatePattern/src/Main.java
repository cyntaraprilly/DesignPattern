/**
 * Created by Cyntara on 6/7/2017.
 */
public class Main {
    public static void main(String[] args) {
        LunchCatering lunchCatering = new LunchCatering();
        lunchCatering.prepareMeal();

        System.out.println();

        CoffeeBreakCatering coffeeBreakCatering = new CoffeeBreakCatering();
        coffeeBreakCatering.prepareMeal();
    }
}
