package gcrcodebase.practiceproblem;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch)
                result += s.charAt(i);
        }

        System.out.println("Modified String: " + result);
    }
}

