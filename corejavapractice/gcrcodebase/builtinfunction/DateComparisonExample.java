package gcrcodebase.builtinfunction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateComparisonExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First date:");
		String inputDate1 = sc.nextLine();
		
		System.out.println("Enter second date:");
		String inputDate2 = sc.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		 LocalDate date1 = LocalDate.parse(inputDate1, formatter);
	     LocalDate date2 = LocalDate.parse(inputDate2, formatter);
		
	     //  Compare dates
	     if (date1.isBefore(date2)) {
	    	 System.out.println("First date is BEFORE second date");
	    	 } else if (date1.isAfter(date2)) {
	            System.out.println("First date is AFTER second date");
	        } else {
	            System.out.println("Both dates are SAME");
	        }
		
		
	}
}
