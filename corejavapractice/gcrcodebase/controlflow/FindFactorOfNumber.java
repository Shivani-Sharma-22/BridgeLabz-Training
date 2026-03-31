package gcrcodebase.controlflow;

import java.util.Scanner;

public class FindFactorOfNumber {
    public static void main(String[] args) {
        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //taking input from user
        int number = sc.nextInt();

        if(number >0){
           //finding factor of a number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
