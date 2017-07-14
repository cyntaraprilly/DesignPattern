/**
 * Created by cyntara on 3/16/17.
 */
public class FishDecorator extends DishDecorator {
    private Rice rice;

    public FishDecorator(Rice rice) {
        this.rice = rice;
        decoratorName = "Fish";
    }

    @Override
    public String getName() {
        return rice.getName()+ " " +getDecoratorName();
    }

    @Override
    public int getPrice() {
        return 10 + rice.getPrice();
    }

}
