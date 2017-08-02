/**
 * Created by cyntara on 5/17/17.
 */
public class ProjectFacade {
    AndroidStudio androidStudio;
    BitBucket bitBucket;
    Jira jira;

    public ProjectFacade(AndroidStudio androidStudio, BitBucket bitBucket, Jira jira) {
        this.androidStudio = androidStudio;
        this.bitBucket = bitBucket;
        this.jira = jira;
    }

    public void setUpProject(){
        androidStudio.setup();

        bitBucket.setup();
        bitBucket.getAccess();
        bitBucket.cloneProject();

        jira.setup();
    }

    public void startProject(){
        jira.workOnStory();

        androidStudio.startWorking();

        bitBucket.createBranch();
        bitBucket.pushBranch();
        bitBucket.createPullRequest();

        jira.reviewingCode();
    }

}
