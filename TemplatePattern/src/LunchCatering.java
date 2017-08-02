/**
 * Created by Cyntara on 6/7/2017.
 */
public class LunchCatering extends CateringMeal {

    @Override
    void getFood() {
        System.out.println("Prepare rice, fried chicken, and soup");
    }

    @Override
    void getDrink() {
        System.out.println("Prepare mineral water");
    }
}
