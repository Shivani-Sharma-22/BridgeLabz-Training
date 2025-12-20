import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;

        int count = 0;

        // count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        int index = 0;

        // store digits in array
        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int[] frequency = new int[10];

        // find frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // display frequency
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
