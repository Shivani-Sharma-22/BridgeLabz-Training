package gcrcodebase.strings;

import java.util.*;
public class VowelConsonantType {
	static String checkChar(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to return character and type in 2D array
    static String[][] findCharType(String text) {

        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (RuntimeException e) {
        }

        String[][] data = new String[len][2];

        for (int i = 0; i < len; i++) {
            data[i][0] = String.valueOf(text.charAt(i));
            data[i][1] = checkChar(text.charAt(i));
        }

        return data;
    }

    // Method to display 2D array
    static void display(String[][] data) {

        System.out.println("Character\tType");
        System.out.println("-----------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = findCharType(text);
        display(result);

        sc.close();
    }
}
