package gcrcodebase.strings;

import java.util.*;
public class TrimString {
	static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = 0;

        // find length without using length()
        try {
            while (true) {
                text.charAt(end);
                end++;
            }
        } catch (RuntimeException e) {
            end = end - 1;
        }

        // trim leading spaces
        while (text.charAt(start) == ' ') {
            start++;
        }

        // trim trailing spaces
        while (text.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    // Method to create substring using charAt()
    static String createSubstring(String text, int start, int end) {

        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings
    static boolean compareStrings(String s1, String s2) {

        int i = 0;
        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            }
        } catch (RuntimeException e) {
        }

        try {
            s2.charAt(i);
            return false;
        } catch (RuntimeException e) {
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] index = findTrimIndexes(text);
        String userTrim = createSubstring(text, index[0], index[1]);
        String builtInTrim = text.trim();

        boolean result = compareStrings(userTrim, builtInTrim);

        System.out.println("User-defined Trim: [" + userTrim + "]");
        System.out.println("Built-in Trim:     [" + builtInTrim + "]");
        System.out.println("Both results are equal: " + result);

        sc.close();
    }
}
