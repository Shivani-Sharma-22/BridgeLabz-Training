package gcrcodebase.strings;

import java.util.*;
public class CompareCharArray {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // calling user-defined method
        char[] userArray = getCharacters(text);

        // calling built-in method
        char[] builtInArray = text.toCharArray();

        // comparing both arrays
        boolean result = compareArrays(userArray, builtInArray);

        // displaying result
        if (result) {
            System.out.println("Both character arrays are equal");
        } else {
            System.out.println("Both character arrays are NOT equal");
        }

        sc.close();
    }
	// user-defined method to return characters of string
    static char[] getCharacters(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // method to compare two character arrays
    static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
}
