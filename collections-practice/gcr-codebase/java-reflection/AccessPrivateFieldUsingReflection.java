package BridgeLabz_Day37_Reflection;

import java.lang.reflect.*;

class Person {
    private int age = 21;
}
public class AccessPrivateFieldUsingReflection {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Class<?> cls = p.getClass();
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true); // for getting access to modify the private field
        System.out.println("Old Age is : " + field.get(p));
        field.set(p, 30);
        System.out.println("New Age is : " + field.get(p));
    }
}
