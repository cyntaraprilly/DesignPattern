/**
 * Created by Cyntara on 22/06/2017.
 */
public class DancerSingerAdapter implements SingerBehaviourInterface {
    private Observable observable;

    private DancerBehaviourInterface dancer;

    public DancerSingerAdapter(DancerBehaviourInterface dancer) {
        this.dancer = dancer;
        observable = new Observable(this);
    }

    @Override
    public void sing() {
        dancer.dance();
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
