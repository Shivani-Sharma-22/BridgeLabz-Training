import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking input month and date from user
		int date=sc.nextInt();
		int month=sc.nextInt();
		
			if(month==3 &&  date>=20) {
				System.out.println("It is a Spring Season");
			}
			else if(month==6 || date<=20) {
				System.out.println("Its a Spring Season");
			}
			else if(month>3 && month<6) {
				System.out.println("Its a Spring Season");
			}
			else {
				System.out.println("Not a Spring Season");
			}
    }
}
