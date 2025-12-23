package gcrcodebase.controlflow;

import java.util.Scanner;

public class PositiveNumberLoop {
    public static void main(String[] args) {
        //creating Scanner Object
        Scanner sc = new Scanner(System.in);
        //taking input number from user
        int number = sc.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        } 
    }
}
