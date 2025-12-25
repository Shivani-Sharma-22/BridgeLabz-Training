package gcrcodebase.methods;

import java.util.*;
public class NumberCheckerFourMain {
	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        System.out.println("Prime Number: " + NumberCheckerFour.isPrime(number));
	        System.out.println("Neon Number: " + NumberCheckerFour.isNeon(number));
	        System.out.println("Spy Number: " + NumberCheckerFour.isSpy(number));
	        System.out.println("Automorphic Number: " + NumberCheckerFour.isAutomorphic(number));
	        System.out.println("Buzz Number: " + NumberCheckerFour.isBuzz(number));

	        sc.close();
	    }
	

}
