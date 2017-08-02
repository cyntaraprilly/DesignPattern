/**
 * Created by Cyntara on 22/06/2017.
 */
public class SingerFactory extends AbstractSingerFactory {

    @Override
    public SingerBehaviourInterface createPopSinger() {
        return new PopSinger();
    }

    @Override
    public SingerBehaviourInterface createJazzSinger() {
        return new JazzSinger();
    }

    @Override
    public SingerBehaviourInterface createRockSinger() {
        return new RockSinger();
    }
}
