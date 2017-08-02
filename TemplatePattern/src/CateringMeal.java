/**
 * Created by Cyntara on 6/7/2017.
 */
public abstract class CateringMeal {
    final void prepareMeal() {
        getFood();
        doPackaging();
        getDrink();
        if (isNeedBeverageMaker()) {
            applyAdditionalFee();
        }
    }

    abstract void getFood();

    abstract void getDrink();

    void doPackaging () {
        System.out.println("Put all food in box");
    }

    boolean isNeedBeverageMaker() {
        return false;
    }

    void applyAdditionalFee() {
        System.out.println("Charge customer with additional fee for additional dish");
    }
}
