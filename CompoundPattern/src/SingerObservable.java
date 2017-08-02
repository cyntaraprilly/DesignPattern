/**
 * Created by Cyntara on 22/06/2017.
 */
public interface SingerObservable {
    void registerObserver (Observer observer);
    void notifyObservers();
}
