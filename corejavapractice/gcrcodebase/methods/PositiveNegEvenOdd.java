package gcrcodebase.methods;

import java.util.Scanner;

public class PositiveNegEvenOdd {

    // Method to check positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2)
            return 1;
        else if (num1 < num2)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        // Input
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        // Check positive/negative and even/odd
        for (int i = 0; i < num.length; i++) {

            if (isPositive(num[i])) {
                System.out.print(num[i] + " is Positive and ");
                if (isEven(num[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(num[i] + " is Negative");
            }
        }

        // Compare first and last element
        int result = compare(num[0], num[num.length - 1]);

        if (result == 1)
            System.out.println("First element is greater than last element");
        else if (result == -1)
            System.out.println("First element is less than last element");
        else
            System.out.println("First and last elements are equal");

        sc.close();
    }
}
