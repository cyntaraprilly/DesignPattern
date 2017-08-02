package ProtectionProxy;

import java.lang.reflect.Proxy;

/**
 * Created by Cyntara on 6/15/2017.
 */
public class ProjectAccess {
    public static Person getProjectManagerAccess (Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new ProjectManagerInvocationHandler(person)
        );
    }

    public static Person getProjectMemberAccess (Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new ProjectMemberInvocationHandler(person)
        );
    }
}
