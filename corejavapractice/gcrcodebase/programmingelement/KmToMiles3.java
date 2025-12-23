package gcrcodebase.programmingelement;

import java.util.Scanner;

public class KmToMiles3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextInt();
        double mile = km * 0.621371;
        System.out.println("The total miles is "+ mile +" mile for the given "+km);
    }
}
