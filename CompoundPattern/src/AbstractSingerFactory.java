/**
 * Created by Cyntara on 22/06/2017.
 */
public abstract class AbstractSingerFactory {

    public abstract SingerBehaviourInterface createPopSinger();

    public abstract SingerBehaviourInterface createJazzSinger();

    public abstract SingerBehaviourInterface createRockSinger();
}
