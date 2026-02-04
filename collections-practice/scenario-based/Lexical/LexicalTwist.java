package Lexical;

import java.util.*;

public class LexicalTwist {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter first word : ");
        String str1 = myScan.nextLine();
        if (str1.contains(" ")) {
            System.out.println(str1 + " is an invalid word");
            return;
        }
        System.out.println("Enter second word : ");
        String str2 = myScan.nextLine();
        if (str2.contains(" ")) {
            System.out.println(str2 + " is an invalid word");
            return;
        }
        StringBuffer sb = new StringBuffer(str2);
        sb.reverse();
        String revStr2 = sb.toString();
        if (str1.equalsIgnoreCase(revStr2)) {
            str1 = str2.toLowerCase();
            String regix = "[aeiou]";
            str1 = str1.replaceAll(regix, "@");
            System.out.println(str1);
        }
        else {
            str1 = (str1 + str2).toUpperCase();
            int vowelCount = 0;
            int consonantCount = 0;
            String vowel = "";
            String consonant = "";
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                if ((ch >= 'A' && ch <= 'Z')) {
                    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        vowelCount++;
                        if (vowel.length() < 2 && !vowel.contains(String.valueOf(ch))) {
                            vowel += ch;
                        }
                    }
                    else {
                        consonantCount++;
                        if (consonant.length() < 2 && !consonant.contains(String.valueOf(ch))) {
                            consonant += ch;
                        }
                    }
                }

            }
            if (vowelCount > consonantCount) {
                System.out.println(vowel);
            }
            else if (consonantCount > vowelCount) {
                System.out.println(consonant);
            }
            else {
                System.out.println("Vowels and Consonants are equal");
            }
        }
    }
}