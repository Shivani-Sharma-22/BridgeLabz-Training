package gcrcodebase.functions;

import java.util.*;
public class NumberCheckerThreeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = NumberChecker.getDigits(number);
        int[] reversed = NumberCheckerThree.reverseDigit(digits);

        System.out.println("Digit Count: " + NumberCheckerThree.countDigits(number));

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.print("Reversed Digits: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Arrays Equal: " +
                NumberCheckerThree.compareArrays(digits, reversed));

        System.out.println("Palindrome Number: " +
                NumberCheckerThree.isPalindrome(digits));

        System.out.println("Duck Number: " +
                NumberCheckerThree.duckNumber(digits));

        sc.close();
	}
}
