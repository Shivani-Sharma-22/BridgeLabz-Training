package gcrcodebase.strings;

import java.util.*;
public class CharacterFrequencyCount {
	static String[][] findFrequency(String text) {

        int[] freq = new int[256];

        // calculate frequency
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != -1) {
                count++;
                freq[text.charAt(i)] = -1;
            }
        }

        String[][] result = new String[count][2];
        freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != -1) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
                freq[ch] = -1;
            }
        }

        return result;
    }
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] data = findFrequency(text);

        System.out.println("Character\tFrequency");
        System.out.println("--------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }

        sc.close();
    }
}
