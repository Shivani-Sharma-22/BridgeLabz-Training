import java.util.Scanner;

public class MultiplesOfANumberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        int number = sc.nextInt();

        // checking number is positive and less than 100
        if (number > 0 && number < 100) {
            int counter = number - 1;

            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
    }
}
