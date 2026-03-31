import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the numerator");
			int numerator = sc.nextInt();
			System.out.println("Enter the denominator");
			int denominator = sc.nextInt();
			
			int ans = numerator/denominator;
			System.out.println("Result = " + ans);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		}
		catch(InputMismatchException e) {
			System.out.println("Error: Please enter valid integers.");
		}
	}
}
