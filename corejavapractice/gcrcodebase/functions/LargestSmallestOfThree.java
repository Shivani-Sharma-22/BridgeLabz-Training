package gcrcodebase.functions;

import java.util.*;
public class LargestSmallestOfThree {

	public static int findLargest(int firstNum, int secondNum, int thirdNum ) {
		
		//Largest 
		if(firstNum > secondNum && firstNum > thirdNum) {
			return firstNum;
		}
		else if(secondNum > firstNum && secondNum > thirdNum) {
			return secondNum;
		}
		else {
			return thirdNum;
		}
		
			
	}
	
	public static int findSmallest(int firstNum, int secondNum, int thirdNum ) {
		
		//smallest 
		if(firstNum < secondNum && firstNum < thirdNum) {
			return firstNum;
		}
		else if(secondNum < firstNum && secondNum < thirdNum) {
			return secondNum;
		}
		else {
			return thirdNum;
		}
		
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter second number");
		int secondNum = sc.nextInt();
		System.out.println("Enter third number");
		int thirdNum = sc.nextInt();
		System.out.println(findLargest(firstNum,secondNum,thirdNum));
		System.out.println(findSmallest(firstNum,secondNum,thirdNum));
	}
}
