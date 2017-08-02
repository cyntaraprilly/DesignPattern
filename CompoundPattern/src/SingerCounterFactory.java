/**
 * Created by Cyntara on 22/06/2017.
 */
public class SingerCounterFactory extends AbstractSingerFactory {

    @Override
    public SingerBehaviourInterface createPopSinger() {
        return new PerformanceCounter(new PopSinger());
    }

    @Override
    public SingerBehaviourInterface createRockSinger() {
        return new PerformanceCounter(new RockSinger());
    }

    @Override
    public SingerBehaviourInterface createJazzSinger() {
        return new PerformanceCounter(new JazzSinger());
    }
}
