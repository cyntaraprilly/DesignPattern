/**
 * Created by cyntara on 5/17/17.
 */
public class Main {
    public static void main(String[] args) {
        AndroidStudio androidStudio = new AndroidStudio();
        BitBucket bitBucket = new BitBucket();
        Jira jira = new Jira();

        ProjectFacade projectFacade = new ProjectFacade(androidStudio, bitBucket, jira);

        System.out.println("Setting up IDE, BitBucket, and Jira");
        System.out.println("==================================");
        projectFacade.setUpProject();
        System.out.println();
        System.out.println("Start project");
        System.out.println("==================================");
        projectFacade.startProject();
    }
}
