/**
 * Created by ASUS on 6/8/2017.
 */
public class IdleState implements State{
    VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        if (vendingMachine.getStock() > 0) {
            System.out.println("You inserted money");
            vendingMachine.setState(vendingMachine.getHasInsertedMoneyState());
        } else {
            System.out.println("You inserted money, but beverage is out of stock");
            vendingMachine.setState(vendingMachine.getIdleState());
        }
    }

    @Override
    public void chooseBeverage() {
        System.out.println("Please insert your money first");
    }

    @Override
    public void dispense() {
        System.out.println("No request received");
    }
}
