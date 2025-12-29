package gcrcodebase.functions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmetic {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 // Step 1: Take date input
        System.out.print("Enter date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();
        
        // Step 2: Formatter
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Step 3: Convert String to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        System.out.println("Original Date: " + date);
        
        //Arithmetic operation add 7 days , 1 month, 2 year
        LocalDate updateDate = date.plusDays(7).plusMonths(1).plusYears(2);
        
        //minus 3 weeks
        
        updateDate = updateDate.minusWeeks(3);
     // Step 6: Print final result
        System.out.println("Final Date after calculations: " + updateDate);
        
        
	}
}
