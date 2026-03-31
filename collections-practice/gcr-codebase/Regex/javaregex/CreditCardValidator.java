package javaregex;
import java.util.*;
import java.util.regex.*;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Credit Card Number:");
        String card = sc.nextLine();

        String regex = "^(4\\d{15}|5\\d{15})$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(card);

        if (m.matches()) {
            if (card.startsWith("4")) {
                System.out.println("Valid Visa Card");
            } else {
                System.out.println("Valid MasterCard");
            }
        } else {
            System.out.println("Invalid Credit Card Number");
        }
    }
}
