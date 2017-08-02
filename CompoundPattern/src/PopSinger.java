import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyntara on 22/06/2017.
 */
public class PopSinger implements SingerBehaviourInterface {
    private Observable observable;

    public PopSinger() {
        observable = new Observable(this);
    }

    @Override
    public void sing() {
        System.out.println("Sing pop song");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
