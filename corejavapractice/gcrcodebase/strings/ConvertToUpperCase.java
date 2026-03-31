package gcrcodebase.strings;

import java.util.*;
public class ConvertToUpperCase {
	// Method to convert text to uppercase using charAt()
    static String convertToUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // if character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result = result + ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // User-defined uppercase conversion
        String userUpper = convertToUpper(text);

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        // Compare both results
        boolean result = compareStrings(userUpper, builtInUpper);

        System.out.println("User-defined Uppercase: " + userUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);

        if (result) {
            System.out.println("Both uppercase results are equal");
        } else {
            System.out.println("Both uppercase results are NOT equal");
        }

        sc.close();
    }

}
