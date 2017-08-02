/**
 * Created by ASUS on 6/8/2017.
 */
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.printStock();

        vendingMachine.insertMoney();
        vendingMachine.insertMoney();
        vendingMachine.chooseDrink();
        vendingMachine.printStock();

        vendingMachine.chooseDrink();
        vendingMachine.printStock();

        vendingMachine.insertMoney();
        vendingMachine.chooseDrink();
        vendingMachine.printStock();

        vendingMachine.insertMoney();
        vendingMachine.chooseDrink();
    }
}
