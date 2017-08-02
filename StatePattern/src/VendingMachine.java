/**
 * Created by ASUS on 6/8/2017.
 */
public class VendingMachine {
     State idleState;
     State hasRequestState;
     State noStockState;
     State hasInsertedMoney;

    private State state;
    private int stock = 2 ;

    public VendingMachine() {
       idleState = new IdleState(this);
       hasRequestState = new HasRequestState(this);
       noStockState = new NoStockState(this);
       hasInsertedMoney = new HasInsertedMoneyState(this);
       if (stock > 0) {
           state = idleState;
       }
    }

    public void insertMoney() {
        state.insertMoney();
    }

    public void chooseDrink() {
        state.chooseBeverage();
        if (stock > 0){
            state.dispense();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getStock() {
        return stock;
    }

    public void releaseStock(){
        stock--;
    }

    public void printStock() {
        System.out.println("\n" + "Current stock: " + stock + "\n");
    }

    public State getIdleState() {
        return idleState;
    }

    public State getHasRequestState() {
        return hasRequestState;
    }

    public State getNoStockState() {
        return noStockState;
    }

    public State getHasInsertedMoneyState() {
        return hasInsertedMoney;
    }

    public State getState() {
        return state;
    }
}
