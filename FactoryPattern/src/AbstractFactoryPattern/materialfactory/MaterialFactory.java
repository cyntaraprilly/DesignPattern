package AbstractFactoryPattern.materialfactory;

/**
 * Created by cyntara on 4/12/17.
 */
public interface MaterialFactory {

    public Fabric createFabric();

    public Sleeve createSleeve();
}
