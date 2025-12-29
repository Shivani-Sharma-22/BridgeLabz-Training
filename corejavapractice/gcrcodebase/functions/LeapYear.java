package gcrcodebase.functions;

import java.util.*;
public class LeapYear {
	public static void leapYear(int year) {
		 if (year >= 1582) {
	            if (year % 400 == 0) {
	                System.out.println("Year is a Leap Year");
	            } else if (year % 100 == 0) {
	                System.out.println("Year is not a Leap Year");
	            } else if (year % 4 == 0) {
	                System.out.println("Year is a Leap Year");
	            } else {
	                System.out.println("Year is not a Leap Year");
	            }
	        } else {
	            System.out.println("Year is not valid");
	        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//input 
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		leapYear(year);
	}
}
