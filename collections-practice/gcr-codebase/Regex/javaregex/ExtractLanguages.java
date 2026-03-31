package javaregex;
import java.util.*;
import java.util.regex.*;

public class ExtractLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        Pattern p = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(m.group() + ", ");
        }
    }
}
