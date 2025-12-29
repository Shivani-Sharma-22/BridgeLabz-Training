package gcrcodebase.functions;

import java.util.*;

public class NumberCheckerFiveMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Perfect Number: " + NumberCheckerFive.isPerfectNumber(num));
        System.out.println("Abundant Number: " + NumberCheckerFive.isAbundantNumber(num));
        System.out.println("Deficient Number: " + NumberCheckerFive.isDeficientNumber(num));
        System.out.println("Strong Number: " + NumberCheckerFive.isStrongNumber(num));

        int[] factors = NumberCheckerFive.getFactors(num);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nGreatest Factor: " + NumberCheckerFive.greatestFactor(factors));
        System.out.println("Sum of Factors: " + NumberCheckerFive.sumOfFactors(factors));
        System.out.println("Product of Factors: " + NumberCheckerFive.productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + NumberCheckerFive.productOfCubeOfFactors(factors));

        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = NumberCheckerFive.generateOTP();
        }

        System.out.print("Generated OTPs: ");
        for (int o : otps) System.out.print(o + " ");

        System.out.println("\nAre OTPs Unique: " + NumberCheckerFive.areOTPsUnique(otps));
    }
}
