import sun.rmi.runtime.Log;

import java.util.logging.Logger;

/**
 * Created by Cynta on 4/12/2017.
 */
public class PrinterSingleton {
    private static PrinterSingleton printerInstance;

    private int count;

    private int paperCount;

    private boolean isEmpty;

    private PrinterSingleton(){
        paperCount = 50;
    }

    public static PrinterSingleton getInstance(){
        if (printerInstance == null) {
            printerInstance = new PrinterSingleton();
        }
        return printerInstance;
    }

    public void print(int amountOfPrint){
        paperCount = paperCount - amountOfPrint;
        if (!isEmpty() && amountOfPrint <= paperCount) {
            count++;
            System.out.println("Print has been used for: " + count);
            System.out.println("Paper count: " + paperCount);
        } else {
            System.out.println("Running out of paper");
        }
    }

    private boolean isEmpty() {
        if (paperCount == 0) {
            return true;
        }
        return false;
    }
}

