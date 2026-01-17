import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesStringBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call method to remove duplicates
        String result = removeDuplicates(input);

        // Display result
        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }

    // Method to remove duplicates using StringBuilder and HashSet
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character not in set, append to StringBuilder
            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }

        return sb.toString();
    }
}
