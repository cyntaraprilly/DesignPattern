/**
 * Created by Cyntara on 22/06/2017.
 */
public class PerformanceTrainer implements Observer {

    @Override
    public void update(SingerObservable singer) {
        System.out.println("TRAINER: A " + singer.getClass().getSimpleName() + " just sang");
    }
}
