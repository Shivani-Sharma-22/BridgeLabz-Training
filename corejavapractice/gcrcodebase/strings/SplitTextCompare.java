package gcrcodebase.strings;

import java.util.*;
public class SplitTextCompare {
	// Method to find string length without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
        }
        return count;
    }

    // Method to split text into words without split()
    static String[] splitText(String text) {

        int len = findLength(text);
        int wordCount = 1;

        // Count words
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndex = new int[wordCount + 1];
        int index = 1;
        spaceIndex[0] = -1;
        spaceIndex[wordCount] = len;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }

        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to compare two string arrays
    static boolean compareArrays(String[] a1, String[] a2) {

        if (a1.length != a2.length)
            return false;

        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userWords = splitText(text);
        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(userWords, builtInWords);

        if (result) {
            System.out.println("Both word arrays are equal");
        } else {
            System.out.println("Both word arrays are NOT equal");
        }

        sc.close();
    }

}
