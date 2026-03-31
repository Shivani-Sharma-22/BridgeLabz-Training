package gcrcodebase.controlflow;

import java.util.Scanner;

public class CheckPosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input a number from user
        int num = sc.nextInt();

        //check for positive number
        if(num >0){
            System.out.println("Positive");
        }
        else if(num == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }
    }
}
