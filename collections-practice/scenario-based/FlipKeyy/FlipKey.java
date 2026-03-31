package FlipKeyy;

import java.util.*;

public class FlipKey {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the Word");
        String input = myScan.nextLine();
        String result = CleanseAndInvert(input);
        if (result.equals("")) {
            System.out.println("Invalid Input");
        }
        else {
            System.out.println("The generated key is : " + result);
        }
    }
    public static String CleanseAndInvert(String str) {
        if (str == null || str.length() < 6) {
            return "";
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                return "";
            }
        }
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((int) ch % 2 != 0) {
                sb.append(ch);
            }
        }
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0) {
                char ch = Character.toUpperCase(sb.charAt(i));
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();
    }
}