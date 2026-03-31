package gcrcodebase.functions;

import java.util.Scanner;

public class PalindromeExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = getInput(sc);

        if (isPalindrome(input)) {
            displayResult("Palindrome");
        } else {
            displayResult("Not Palindrome");
        }
        sc.close();
    }

    public static String getInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    public static boolean isPalindrome(String text) {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return text.equalsIgnoreCase(reverse);
    }

    public static void displayResult(String result) {
        System.out.println("Result: " + result);
    }
}

