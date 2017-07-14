/**
 * Created by cyntara on 3/16/17.
 */
public abstract class Rice {
    protected String name;

    public String getName() {
        return name;
    }

    public int getFinalPrice(){
        return getPrice() * 1000;
    }

    protected abstract int getPrice();
}
