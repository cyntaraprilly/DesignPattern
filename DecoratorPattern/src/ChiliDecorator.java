/**
 * Created by cyntara on 3/16/17.
 */
public class ChiliDecorator extends DishDecorator {
    Rice rice; //composition, to hold what type of rice it decorates

    public ChiliDecorator(Rice rice) {
        this.rice = rice;
        decoratorName = "Chili";
    }

    @Override
    public String getName() {
        return rice.getName() + " " + getDecoratorName();
    }

    @Override
    public int getPrice() {
        return 2 + rice.getPrice();
    }


}
