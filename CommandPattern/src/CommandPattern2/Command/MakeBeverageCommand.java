package CommandPattern2.Command;

import CommandPattern2.Object.Order;

/**
 * Created by cyntara on 4/17/17.
 */
public class MakeBeverageCommand implements Command {
    Order order;

    public MakeBeverageCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.makeBeverage();
    }
}
