import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Cyntara on 22/06/2017.
 */
public class Observable implements SingerObservable {
    List<Observer> observers = new ArrayList<>();
    SingerObservable singer;

    public Observable(SingerObservable singer) {
        this.singer = singer;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            observer.update(singer);
        }
    }
}
