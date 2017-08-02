package ProtectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ASUS on 6/15/2017.
 */
public class ProjectMemberInvocationHandler implements InvocationHandler {
    Person person;

    public ProjectMemberInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
