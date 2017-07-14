/**
 * Created by cyntara on 3/16/17.
 */
public class ChickenDecorator extends DishDecorator {
    private Rice rice;

    public ChickenDecorator(Rice rice) {
        this.rice = rice;
        decoratorName = "Chicken";
    }

    @Override
    public String getName() {
        return rice.getName() + " " + getDecoratorName() + "(" + getChickenPart() + ")";
    }

    @Override
    public int getPrice() {
        return 8 + rice.getPrice();
    }

    public String getChickenPart(){
        String chickenBodyPart = "";

        if (rice.getName().contains("Yellow Rice")){
            chickenBodyPart = "Drumstick";
        }
        else if (rice.getName().contains("Fried Rice")){
            chickenBodyPart =  "Thigh";

        }
        return chickenBodyPart;
    }

}
