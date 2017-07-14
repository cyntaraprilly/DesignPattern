package CommandPattern2.Command;

import CommandPattern2.Object.Stock;

/**
 * Created by cyntara on 4/17/17.
 */
public class AddFoodStockCommand implements Command {
    Stock stock;

    public AddFoodStockCommand(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.addFoodStock();
    }
}
