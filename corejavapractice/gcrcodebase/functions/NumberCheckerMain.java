package gcrcodebase.functions;

import java.util.*;

public class NumberCheckerMain {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = NumberChecker.getDigits(number);

        System.out.println("Digit Count: " + NumberChecker.countDigits(number));
        System.out.println("Duck Number: " + NumberChecker.isDuckNumber(digits));
        System.out.println("Armstrong Number: " + NumberChecker.isArmstrong(number, digits));
        //  Largest & Second Largest
        int[] largest = NumberChecker.findLargestAndSecondLargest(digits);
        System.out.println("Largest Number: " + largest[0]);
        System.out.println("Second Largest Number: " + largest[1]);
        // Smallest and Second Smallest
        int[] smallest = NumberChecker.findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Number: " + smallest[0]);
        System.out.println("Second Smallest Number: " + smallest[1]);
        sc.close();
    }
}
