/**
 * Created by cyntara on 5/18/17.
 */
public class PoliceMilitaryAdapter implements Military {
    PoliceSniper police;

    public PoliceMilitaryAdapter(PoliceSniper police) {
        this.police = police;
    }

    @Override
    public void attack() {
        for (int i = 0; i < 3; i++){
            police.attack();
        }
    }

    @Override
    public void camouflage() {
        police.hideFromEnemy();
    }
}
