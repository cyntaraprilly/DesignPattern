package AbstractFactoryPattern.materialfactory;

/**
 * Created by cyntara on 4/12/17.
 */
public class BillabongMaterialFactory implements MaterialFactory {

    @Override
    public Fabric createFabric() {
        return new CottonFabric();
    }

    @Override
    public Sleeve createSleeve() {
        return new ShortSleeves();
    }
}
