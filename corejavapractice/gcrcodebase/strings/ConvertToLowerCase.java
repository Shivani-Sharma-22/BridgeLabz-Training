package gcrcodebase.strings;

import java.util.*;
public class ConvertToLowerCase {
	// Method to convert text to lowercase using charAt()
    static String convertToLower(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // if character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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

       
        String userLower = convertToLower(text);
        String builtInLower = text.toLowerCase();

        // Compare both results
        boolean result = compareStrings(userLower, builtInLower);

        System.out.println("User-defined Lowercase: " + userLower);
        System.out.println("Built-in Lowercase: " + builtInLower);

        if (result) {
            System.out.println("Both lowercase results are equal");
        } else {
            System.out.println("Both lowercase results are NOT equal");
        }

        sc.close();
    }
}
