import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Cyntara on 22/06/2017.
 */
public class Group implements SingerBehaviourInterface {

    private List singers = new ArrayList();


    public void add (SingerBehaviourInterface singer) {
        singers.add(singer);
    }

    @Override
    public void sing() {
        Iterator iterator = singers.iterator();
        while (iterator.hasNext()) {
            SingerBehaviourInterface singer = (SingerBehaviourInterface) iterator.next();
            singer.sing();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = singers.iterator();
        while (iterator.hasNext()) {
            SingerBehaviourInterface singer = (SingerBehaviourInterface) iterator.next();
            singer.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
