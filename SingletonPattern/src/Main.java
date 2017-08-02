
/**
 * Created by Cynta on 4/12/2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("\nCyntara is printing 5 pages");
        PrinterSingleton.getInstance().print(5);

        System.out.println("\nPrilly is printing 10 pages");
        PrinterSingleton.getInstance().print(10);

        System.out.println("\nAdwinda is printing 35 pages");
        PrinterSingleton.getInstance().print(35);

        System.out.println("\nCynta is printing 35 pages");
        PrinterSingleton.getInstance().print(35);
    }
}

