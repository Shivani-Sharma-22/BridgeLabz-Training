package BridgeLabz_Day37_Reflection;

import java.util.*;

public class GetClassInformation {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = sc.nextLine();
        Class<?> cls = Class.forName(className);
        System.out.println("Class Name : " + cls.getName());
//      ---- Fields ----
        System.out.println("\nFields:");
        var fields = cls.getDeclaredFields();
        for (var f : fields) {
            System.out.println(f.getName());
        }
//      ---- Methods ----
        System.out.println("\nMethods:");
        var methods = cls.getDeclaredMethods();
        for (var m : methods) {
            System.out.println(m.getName());
        }
//      ---- Constructors ----
        System.out.println("\nConstructors:");
        var constructors = cls.getDeclaredConstructors();
        for (var c : constructors) {
            System.out.println(c);
        }
    }
}

