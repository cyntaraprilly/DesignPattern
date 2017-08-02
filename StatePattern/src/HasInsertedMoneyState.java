/**
 * Created by ASUS on 6/8/2017.
 */
public class HasInsertedMoneyState implements State {
    VendingMachine vendingMachine;

    public HasInsertedMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("You have already inserted money. Please choose your beverage");
    }

    @Override
    public void chooseBeverage() {
        System.out.println("You choose a beverage");
        vendingMachine.setState(vendingMachine.getHasRequestState());
    }

    @Override
    public void dispense() {
        System.out.print("Please wait for your beverage");
    }
}
