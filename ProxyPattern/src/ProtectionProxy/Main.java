package ProtectionProxy;

/**
 * Created by Cyntara on 6/15/2017.
 */
public class Main {
    public static void main(String[] args) {
        Person projectManager = new RealPerson();
        Person managerAccess = ProjectAccess.getProjectManagerAccess(projectManager);
        System.out.println("------------Project Manager------------");

        managerAccess.getReadAccess();
        managerAccess.getEditAccess();
        System.out.println("Change edit access");
        managerAccess.setEditAccess(true);
        managerAccess.getEditAccess();

        System.out.println("\n\n");

        Person projectMember = new RealPerson();
        Person memberAccess = ProjectAccess.getProjectMemberAccess(projectMember);
        System.out.println("------------Project Member------------");

        memberAccess.getReadAccess();
        memberAccess.getEditAccess();
        System.out.println("Change edit access");
        try {
            memberAccess.setEditAccess(true);
        } catch (Exception e) {
            System.out.println("Sorry you cannot change your edit access");
        }
    }
}