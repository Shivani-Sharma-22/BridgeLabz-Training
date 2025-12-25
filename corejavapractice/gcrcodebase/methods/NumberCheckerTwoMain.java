package gcrcodebase.methods;

import java.util.*;
public class NumberCheckerTwoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = NumberChecker.getDigits(number);

        System.out.println("Digit Count: " + NumberCheckerTwo.countDigits(number));
        System.out.println("Sum of Digits: " + NumberCheckerTwo.sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + NumberCheckerTwo.sumOfSquares(digits));
        System.out.println("Harshad Number: " + NumberCheckerTwo.isHarshad(number, digits));

        System.out.println("Digit Frequency:");
        int[][] freq = NumberCheckerTwo.digitFrequency(digits);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " → " + freq[i][1]);
            }
        }

        sc.close();
	}
}
