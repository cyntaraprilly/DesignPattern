package VirtualProxy;

/**
 * Created by Cyntara on 6/15/2017.
 */
public class ImageProxy implements Image {
    boolean hasLoaded;
    RealImage realImage;

    @Override
    public void loadImage() {
        if (realImage != null) {
            realImage.loadImage();
        } else {
            System.out.println("Loading your image...");
            if (!hasLoaded) {
                hasLoaded = true;
                try {
                    Thread.sleep(3000);
                    realImage = new RealImage();
                    realImage.loadImage();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String getName() {
        if (realImage == null) {
            return "NO PICTURE";
        } else {
            return realImage.getName();
        }
    }
}
