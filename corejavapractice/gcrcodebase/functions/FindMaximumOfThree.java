package gcrcodebase.functions;

import java.util.*;
public class FindMaximumOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter Third number:");
		int num3 = sc.nextInt();
		System.out.println(maximumOfThree(num1,num2,num3));
	}

	private static int maximumOfThree(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		if(num1 > num2 && num1 > num3) {
			return num1;
		}
		else if(num2>num1 && num2 > num3) {
			return num2;
		}
		else {
			return num3;
		}
	}
}
