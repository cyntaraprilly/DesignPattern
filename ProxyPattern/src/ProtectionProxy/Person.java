package ProtectionProxy;

/**
 * Created by Cyntara on 6/15/2017.
 */
public interface Person {
    void setEditAccess(boolean canEdit);

    void getReadAccess();
    void getEditAccess();
}
