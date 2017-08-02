/**
 * Created by cyntara on 4/17/17.
 */
public class DoubleCheckedLockingPrinterSingleton {
    private static DoubleCheckedLockingPrinterSingleton printerInstance;

    private int count;

    private int paperCount;

    private boolean isEmpty;

    private DoubleCheckedLockingPrinterSingleton(){
        paperCount = 50;
    }

    public static DoubleCheckedLockingPrinterSingleton getInstance() {
        if (printerInstance == null) {
            synchronized (DoubleCheckedLockingPrinterSingleton.class) {
                if (printerInstance == null) {
                    printerInstance = new DoubleCheckedLockingPrinterSingleton();
                }
            }
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
        if (paperCount==0) {
            return true;
        }
        return false;
    }
}
