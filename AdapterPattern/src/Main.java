/**
 * Created by cyntara on 5/18/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Using military sniper: ");
        MilitarySniper militarySniper = new MilitarySniper();
        militarySniper.attack();
        militarySniper.camouflage();
        System.out.println();

        System.out.println("Using police sniper: ");
        PoliceSniper policeSniper = new PoliceSniper();
        policeSniper.attack();
        policeSniper.hideFromEnemy();
        System.out.println();

        System.out.println("Using police-military adapter: ");
        PoliceMilitaryAdapter adapter = new PoliceMilitaryAdapter(policeSniper);
        adapter.attack();
        adapter.camouflage();
        System.out.println();

    }
}
