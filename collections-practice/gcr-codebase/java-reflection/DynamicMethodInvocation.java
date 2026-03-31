package BridgeLabz_Day37_Reflection;

import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
}
public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter method name : ");
        String methodName = myScan.nextLine();

        MathOperations obj = new MathOperations();
        Class<?> cls = obj.getClass();
        Method method = cls.getMethod(methodName, int.class, int.class);

        int result = (int) method.invoke(obj, 10, 5);
        System.out.println("Result : " + result);
    }
}
