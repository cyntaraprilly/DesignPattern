/**
 * Created by cyntara on 4/17/17.
 */
public class EagerlyPrinterSingleton {
    private static EagerlyPrinterSingleton printerInstance = new EagerlyPrinterSingleton();

    private int count;

    private int paperCount;

    private boolean isEmpty;

    private EagerlyPrinterSingleton() {
        paperCount = 50;
    }

    public static EagerlyPrinterSingleton getInstance() {
        return printerInstance;
    }

    public void print(int amountOfPrint) {
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

