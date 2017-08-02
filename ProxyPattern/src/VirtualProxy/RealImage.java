package VirtualProxy;

/**
 * Created by Cyntara on 6/15/2017.
 */
public class RealImage implements Image {
    @Override
    public void loadImage() {
        System.out.println("Image has succesfully loaded");
    }

    @Override
    public String getName() {
        return "MyPicture.png";
    }
}
