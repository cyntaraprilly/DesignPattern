public class SynchronizedPrinterSingleton {
    private static SynchronizedPrinterSingleton printerInstance;

    private int count;

    private int paperCount;

    private boolean isEmpty;

    private SynchronizedPrinterSingleton() {
        paperCount = 50;
    }

    public static synchronized SynchronizedPrinterSingleton getInstance() {
        if (printerInstance == null) {
            printerInstance = new SynchronizedPrinterSingleton();
        }
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
        if (paperCount==0) {
            return true;
        }
        return false;
    }
}

