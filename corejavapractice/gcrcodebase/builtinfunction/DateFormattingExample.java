package gcrcodebase.builtinfunction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample {
	public static void main(String[] args) {
		
		LocalDate currDate = LocalDate.now();
		
		// Format 1: dd/MM/yyyy
        DateTimeFormatter formatter1 =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("date in the format of dd/MM/yyyy : " + currDate.format(formatter1));
		
		//yyyy-MM-dd 
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("date in the format of yyyy-MM-dd :"+ currDate.format(formatter2));
		
		//EEE, MMM dd, yyyy
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		System.out.println("date in the format of EEE, MMM dd, yyyy :"+currDate.format(formatter3));
		
	}
}
