package javaregex;
import java.util.*;
import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SSN:");
        String text = sc.nextLine();

        Pattern p = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("Valid SSN: " + m.group());
        }
         
    }
}

