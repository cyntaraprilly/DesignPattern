package VirtualProxy;

/**
 * Created by Cyntara on 6/15/2017.
 */
public class Main {
    public static void main(String[] args) {
        ImageProxy proxy = new ImageProxy();

        System.out.println("First time loading image");
        proxy.loadImage();
        System.out.println(proxy.getName());

        System.out.println("\nSecond time loading image");
        proxy.loadImage();
        proxy.getName();
    }
}
