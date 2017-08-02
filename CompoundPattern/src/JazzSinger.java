/**
 * Created by Cyntara on 22/06/2017.
 */
public class JazzSinger implements SingerBehaviourInterface {
    private Observable observable;

    public JazzSinger() {
        observable = new Observable(this);
    }

    @Override
    public void sing() {
        System.out.println("Sing jazz song");
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
