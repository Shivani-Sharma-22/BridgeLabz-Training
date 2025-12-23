package gcrcodebase.controlflow;

import java.util.Scanner;

public class CheckFirstNumberSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		if(number1<number2 && number1<number3) {
			System.out.println("Is the first number the smallest?YES");
		}
		else {
			System.out.println("Is the first number the smallest?NO");
		}
    }
}
