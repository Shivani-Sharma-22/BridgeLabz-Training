import java.util.Scanner;

public class PowerOfANumberUsingWhile {
    public static void main(String[] args) {
        // Input number and power
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number ");
        int number = sc.nextInt();
        System.out.println("Enter the power ");
        int power = sc.nextInt();

        // Initialize result
        int result = 1;

        // Initialize counter
        int tempVar = 0;
        if (number > 0 && power > 0) {
            // While loop till counter == power
            while (tempVar < power) {
                result = result * number; // multiply result by number
                tempVar++; // increment counter
            }
        }
        System.out.println(result);
    }
}
