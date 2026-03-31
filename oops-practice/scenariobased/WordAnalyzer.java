import java.util.Scanner;

public class WordAnalyzer {

    public static int analyze(String input) {
        int count = 0;

        input = input.trim();   // remove extra spaces

        if (input.length() == 0)
            return 0;

        for (int i = 0; i < input.length(); i++) {
            if (i == 0 && input.charAt(i) != ' ') {
                count++;
            } 
            else if (input.charAt(i) != ' ' && input.charAt(i - 1) == ' ') {
                count++;
            }
        }
        return count;
    }
    public static String longestWord(String input) {
    	if (input == null || input.trim().isEmpty()) {
            return "";
        }
    	input = input.trim();
        String longest = "";
        String current = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                current += input.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }
        // last word check
        if (current.length() > longest.length()) {
            longest = current;
        }
    	return longest;
    }
    //Replace word (case-insensitive)
    public static String replaceWord(String input, String oldWord, String newWord) {
        if (input == null || input.trim().isEmpty()) {
            return input;
        }
        return input.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        System.out.println("Write paragraph:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
     // Edge case check
        if (input.trim().isEmpty()) {
            System.out.println("Paragraph is empty or contains only spaces.");
            return;
        }
        
        int result = analyze(input);
        String result1 = longestWord(input);
        System.out.println("Total words: " + result);
        System.out.println("Longest words: " + result1);
        System.out.println("Length: " + result1.length());
     // Replace
        System.out.println("Enter word to replace:");
        String oldWord = sc.nextLine();

        System.out.println("Enter new word:");
        String newWord = sc.nextLine();

        String updatedParagraph = replaceWord(input, oldWord, newWord);
        System.out.println("Updated paragraph:");
        System.out.println(updatedParagraph);
        sc.close();
    }
}
