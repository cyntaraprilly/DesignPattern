package AbstractFactoryPattern.materialfactory;

/**
 * Created by Cynta on 4/12/2017.
 */
public class ZaraMaterialFactory implements MaterialFactory {

    @Override
    public Fabric createFabric() {
        return new SilkFabric();
    }

    @Override
    public Sleeve createSleeve() {
        return new LongSleeves();
    }
}

