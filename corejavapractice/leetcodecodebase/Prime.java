package leetcodecodebase;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input a number
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is NOT a prime number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is a PRIME number");
        else
            System.out.println(num + " is NOT a prime number");

        sc.close();
    }
}
