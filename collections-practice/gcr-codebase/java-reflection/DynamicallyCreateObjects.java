package BridgeLabz_Day37_Reflection;

import java.lang.reflect.*;

class Student {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Student Name: " + name);
    }
}
public class DynamicallyCreateObjects {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Studentt.class;
        Constructor<?> cons = cls.getConstructor(String.class);
        Studentt s = (Studentt) cons.newInstance("Aman");
        s.display();
    }
}
