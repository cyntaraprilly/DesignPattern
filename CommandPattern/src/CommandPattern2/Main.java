package CommandPattern2;

import CommandPattern2.Command.*;
import CommandPattern2.Invoker.Employee;
import CommandPattern2.Object.Order;
import CommandPattern2.Object.Stock;

/**
 * Created by cyntara on 4/17/17.
 */
public class Main {
    public static void main(String[] args) {
        Employee waitress = new Employee();

        System.out.println("A customer order 1 beverage and 1 burger");
        Order order = new Order();
        MakeBeverageCommand makeBeverageCommand = new MakeBeverageCommand(order);
        MakeFoodCommand makeFoodCommand = new MakeFoodCommand(order);

        waitress.setCommand(makeBeverageCommand);
        waitress.work();

        waitress.setCommand(makeFoodCommand);
        waitress.work();
        
        System.out.println("\nBoss asks you to re-stock food ingredients and beverage cups");
        Stock stock = new Stock();
        AddFoodStockCommand addFoodStockCommand = new AddFoodStockCommand(stock);
        AddBeverageStockCommand addBeverageStockCommand = new AddBeverageStockCommand(stock);

        waitress.setCommand(addFoodStockCommand);
        waitress.work();

        waitress.setCommand(addBeverageStockCommand);
        waitress.work();

        System.out.println(waitress.toString());
    }
}
