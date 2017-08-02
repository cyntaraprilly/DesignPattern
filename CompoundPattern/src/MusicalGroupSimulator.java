/**
 * Created by Cyntara on 22/06/2017.
 */
public class MusicalGroupSimulator {

    public void simulate(AbstractSingerFactory singerFactory) {
        Group allSingers = new Group();
        Group popSingers = new Group();

        SingerBehaviourInterface rockSinger = singerFactory.createRockSinger();
        SingerBehaviourInterface jazzSinger = singerFactory.createJazzSinger();
        allSingers.add(rockSinger);
        allSingers.add(jazzSinger);


        SingerBehaviourInterface popSingerOne = singerFactory.createPopSinger();
        SingerBehaviourInterface popSingerTwo = singerFactory.createPopSinger();
        popSingers.add(popSingerOne);
        popSingers.add(popSingerTwo);

        allSingers.add(popSingers);

        PerformanceTrainer trainer = new PerformanceTrainer();
        allSingers.registerObserver(trainer);

        simulate(allSingers);

        System.out.println("There are " + PerformanceCounter.getNumberOfSingingPerformance() + " performances from singer today");
    }

    private void simulate(SingerBehaviourInterface singer) {
        singer.sing();
    }
}
