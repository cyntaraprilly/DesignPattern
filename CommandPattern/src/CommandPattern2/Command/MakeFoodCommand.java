package CommandPattern2.Command;

import CommandPattern2.Object.Order;

/**
 * Created by cyntara on 4/17/17.
 */
public class MakeFoodCommand implements Command {
    Order order;

    public MakeFoodCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.makeFood();
    }
}
