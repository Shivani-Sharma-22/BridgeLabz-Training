package gcrcodebase.controlflow;

import java.util.Scanner;

public class MultiplesOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number >0 && number < 100){
            //for loop from 100 to 1
            for(int i = 100;i>=1;i--){
                if(i % number ==0){
                    System.out.println(i);
                }
            }
        }
    }
}
