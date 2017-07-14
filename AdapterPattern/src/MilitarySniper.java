/**
 * Created by cyntara on 5/18/17.
 */
public class MilitarySniper  implements Military{
    @Override
    public void attack() {
        System.out.println("Shoot with sniper rifles");
    }

    @Override
    public void camouflage() {
        System.out.println("Start camouflaging");
    }
}
