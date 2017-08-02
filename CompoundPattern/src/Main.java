/**
 * Created by Cyntara on 22/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        MusicalGroupSimulator simulator = new MusicalGroupSimulator();
        AbstractSingerFactory singerFactory = new SingerCounterFactory();
        simulator.simulate(singerFactory);
    }
}
