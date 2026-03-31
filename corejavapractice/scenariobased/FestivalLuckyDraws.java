package scenariobased;

import java.util.*;
public class FestivalLuckyDraws {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Draw a number: ");
			if(sc.hasNextInt()) {
			double number = sc.nextInt();
			
			if(number%3 ==0 && number%5 ==0) {
				System.out.println("Congratulation you win a gift!");
			}
			else {
				System.out.println("Sorry next time");
			}
			}
			else {
				String input = sc.next();
				if(input.equalsIgnoreCase("exit"))break;
				
				//invalid input skip
				System.out.println("Invalid input skip");
				continue;
			}
		}
		System.out.println("Lucky Draw Closed");
		sc.close();
	}
}
