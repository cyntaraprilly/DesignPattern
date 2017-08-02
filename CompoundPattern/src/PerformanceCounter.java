/**
 * Created by Cyntara on 22/06/2017.
 */
public class PerformanceCounter implements SingerBehaviourInterface {
    SingerBehaviourInterface singer;
    static int numberOfSingingPerformance;

    public PerformanceCounter(SingerBehaviourInterface singer) {
        this.singer = singer;
    }

    @Override
    public void sing() {
        singer.sing();
        numberOfSingingPerformance++;
    }

    public static int getNumberOfSingingPerformance() {
        return numberOfSingingPerformance;
    }

    @Override
    public void registerObserver(Observer observer) {
        singer.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        singer.notifyObservers();
    }
}
