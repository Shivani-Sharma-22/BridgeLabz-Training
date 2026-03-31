package gcrcodebase.controlflow;

import java.util.*;

public class GreatestFactorOfANUmber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int greatestFactor = 1;

        // Check for positive integer
        if (number > 1) {

            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }

            System.out.println("Greatest factor is " + greatestFactor);

        }
    }
}