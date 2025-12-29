package gcrcodebase.functions;

import java.util.*;
public class SpringSeason {
	public static void springSeason(int day,int month) {
		
		if(month == 3 && day >= 20) {
			System.out.println("It is a Spring Season");
		}
		else if(month > 3 && month < 6) {
			System.out.println("It is  a Spring Season");
		}
		else if(month == 6 && day <= 20){
			System.out.println("It is a Spring Season");
		}
		else {
			System.out.println("It is not a Spring Season");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int month = sc.nextInt();
		springSeason(day,month);
	}
}
