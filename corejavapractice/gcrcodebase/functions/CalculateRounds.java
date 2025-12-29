package gcrcodebase.functions;

import java.util.*;
public class CalculateRounds {
	public static int rounds(int firstSide,int secondSide,int thirdSide,int run) {
		return (firstSide+secondSide+thirdSide)/run;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int run = 5;
		System.out.println("Enter the first side of triangle");
		int firstSide = sc.nextInt();
		
		System.out.println("Enter the second side of triangle");
		int secondSide = sc.nextInt();
		
		System.out.println("Enter the third side of triangle");
		int thirdSide = sc.nextInt();
		
		
		System.out.println("the number of rounds user needs to do to complete 5km run is :"+ rounds(firstSide,secondSide,thirdSide,run));
		
	}
}
