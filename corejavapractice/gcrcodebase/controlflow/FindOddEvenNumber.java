import java.util.*;

public class FindOddEvenNumber {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Taking input N
        int number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (i % 2 != 0) {
                System.out.println("The number is odd " + i);
            } else {
                System.out.println("The number is even " + i);
            }
        }

    }
}
