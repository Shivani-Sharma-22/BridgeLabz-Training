package gcrcodebase.strings;

import java.util.*;

public class IllegalArgumentExceptions {

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled: Start index is greater than end index");
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("\nGenerating Exception:");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception caught in main method");
        }

        System.out.println("\nHandling Exception:");
        handleException(text);

        sc.close();
    }
}
