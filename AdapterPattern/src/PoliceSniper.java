/**
 * Created by cyntara on 5/18/17.
 */
public class PoliceSniper implements Police {
    @Override
    public void attack() {
        System.out.println("Shoot enemy with pistol gun");
    }

    @Override
    public void hideFromEnemy() {
        System.out.println("Hide behind any nearest object");
    }
}
