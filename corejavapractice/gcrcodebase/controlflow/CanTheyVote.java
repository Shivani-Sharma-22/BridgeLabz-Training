package gcrcodebase.controlflow;

import java.util.Scanner;

public class CanTheyVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input age from user
        int age = sc.nextInt();

        //check for vote
        if(age >= 18){
            System.out.println("The person can vote");
        }else{
            System.out.println("The person cannot vote.");
        }
    }
}
