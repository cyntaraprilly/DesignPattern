/**
 * Created by ASUS on 6/8/2017.
 */
public class HasRequestState implements State {
    VendingMachine vendingMachine;

    public HasRequestState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Please wait until your beverage is dispensed");
    }

    @Override
    public void chooseBeverage() {
        System.out.println("Please wait until your beverage is dispensed");
    }

    @Override
    public void dispense() {
        System.out.println("Please take your beverage");
        vendingMachine.releaseStock();
        if (vendingMachine.getStock() > 0){
            vendingMachine.setState(vendingMachine.getIdleState());
        } else {
            vendingMachine.setState(vendingMachine.getNoStockState());
        }
    }
}
