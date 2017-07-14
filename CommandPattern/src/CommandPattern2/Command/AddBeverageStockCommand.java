package CommandPattern2.Command;

import CommandPattern2.Object.Stock;

/**
 * Created by cyntara on 4/17/17.
 */
public class AddBeverageStockCommand implements Command{
    Stock stock;

    public AddBeverageStockCommand(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.addBeverageStock();
    }
}
