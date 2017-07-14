/**
 * Created by cyntara on 3/16/17.
 */
public abstract class DishDecorator extends Rice{
    protected String decoratorName;

    public abstract String getName();

    public String getDecoratorName() {
        return decoratorName;
    }
}
