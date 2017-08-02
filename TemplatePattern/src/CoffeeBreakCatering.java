/**
 * Created by Cyntara on 6/7/2017.
 */
public class CoffeeBreakCatering extends CateringMeal {

    @Override
    void getFood() {
        System.out.println("Prepare snack and cake");

    }

    @Override
    void getDrink() {
        System.out.println("Prepare coffee");
    }

    @Override
    boolean isNeedBeverageMaker() {
        return true;
    }
}
