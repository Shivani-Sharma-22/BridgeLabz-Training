package gcrcodebase.methods;

import java.util.*;
public class WindChill {
	public static double calculateWindChill(double temp, double speed) {
		double windChill = (35.74 + 0.6215 *temp + (0.4275*temp - 35.75)) * Math.pow(speed, 0.6);
		return windChill;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the WindSpeed");
		double speed = sc.nextInt();
		System.out.println("Enter the Temparature");
		double temp = sc.nextInt();
		
		System.out.println(calculateWindChill(temp,speed));
	}
}
