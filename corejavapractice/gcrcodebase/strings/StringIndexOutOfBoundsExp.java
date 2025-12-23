package gcrcodebase.strings;

import java.util.*;
public class StringIndexOutOfBoundsExp {
	public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled: Invalid index");
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Calling method to generate exception
        System.out.println("\nGenerating Exception:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main method");
        }

        // Calling method to handle exception
        System.out.println("\nHandling Exception:");
        handleException(text);

        sc.close();
    }
}
