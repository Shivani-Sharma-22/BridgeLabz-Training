package gcrcodebase.practiceproblem;

import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String s = sc.nextLine();
        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        int count = 0;
        for (int i = 0; i <= s.length() - sub.length(); i++) {
            if (s.substring(i, i + sub.length()).equals(sub))
                count++;
        }

        System.out.println("Occurrences: " + count);
    }
}

