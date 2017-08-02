package ProtectionProxy;

/**
 * Created by Cyntara on 6/15/2017.
 */
public class RealPerson implements Person {
    boolean canEdit;
    boolean canRead;

    public RealPerson() {
        canRead = true;
    }

    @Override
    public void setEditAccess(boolean canEdit) {
        this.canEdit = canEdit;
    }

    @Override
    public void getReadAccess() {
        String str = "Get read access: ";
        if (canRead) {
            System.out.println(str + "Can read this repository");
        } else {
            System.out.println(str + "Sorry! Access to read is not granted");
        }
    }

    @Override
    public void getEditAccess() {
        String str = "Get edit access: ";
        if (canEdit) {
            System.out.println(str + "Can edit this repository");
        } else {
            System.out.println(str + "Sorry! Access to edit is not granted");
        }
    }
}
