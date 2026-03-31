package javaregex;
import java.util.*;
import java.util.regex.*;

public class FindRepeatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String text = sc.nextLine();

        Pattern p = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(m.group(1) + ", ");
        }
    }
}

