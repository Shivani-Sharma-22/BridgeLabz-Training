package gcrcodebase.programmingelement;

import java.util.Scanner;

public class CalQuotientAndReminder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Taking first number input from user
        int number1 = input.nextInt();

        // Taking second number input from user
        int number2 = input.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Displaying the result
        System.out.println("The Quotient is " + quotient +
                " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);
    }
}