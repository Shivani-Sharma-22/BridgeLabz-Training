package gcrcodebase.functions;

import java.util.*;
public class UnitConvertorFrahent {
	public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius = " + UnitConvertorFrahent.convertFarhenheitToCelsius(f));

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + UnitConvertorFrahent.convertCelsiusToFarhenheit(c));

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms = " + UnitConvertorFrahent.convertPoundsToKilograms(pounds));

        System.out.print("Enter weight in kilograms: ");
        double kg = sc.nextDouble();
        System.out.println("Pounds = " + UnitConvertorFrahent.convertKilogramsToPounds(kg));

        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Liters = " + UnitConvertorFrahent.convertGallonsToLiters(gallons));

        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();
        System.out.println("Gallons = " + UnitConvertorFrahent.convertLitersToGallons(liters));

        sc.close();
	}
}
