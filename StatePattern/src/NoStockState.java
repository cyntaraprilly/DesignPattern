/**
 * Created by ASUS on 6/8/2017.
 */
public class NoStockState implements State {
    VendingMachine vendingMachine;

    public NoStockState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Beverage is out of stock. Please take again your money");
    }

    @Override
    public void chooseBeverage() {
        System.out.println("Beverage is currently out of stock");
    }

    @Override
    public void dispense() {
        System.out.println("Nothing to dispense. Beverage is currently out of stock");
    }
}
