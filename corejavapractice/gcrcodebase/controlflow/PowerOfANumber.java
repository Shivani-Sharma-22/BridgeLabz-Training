package gcrcodebase.controlflow;

import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input for two variables - number and power
        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;
        if (number > 0 && power > 0) {

            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
        }
        System.out.println(result);
    }
}
