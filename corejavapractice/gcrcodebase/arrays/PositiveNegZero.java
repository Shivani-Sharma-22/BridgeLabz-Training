package gcrcodebase.arrays;

import java.util.Scanner;

public class PositiveNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =5;
        //array
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<arr.length;i++){
            if(arr[i] > 0){
                if(arr[i] % 2==0){
                    System.out.println("Even number: "+ arr[i]);
                }
                else{
                    System.out.println("Odd number: "+ arr[i]);
                }
            }
            else if(arr[i] == 0){
                System.out.println("Zero");
            }
            else {
                System.out.println("Negative Number");
            }
            if(arr[i] == arr[n-1]){
                System.out.println("equal");
            }
            else if(arr[i] < arr[n-1]){
                System.out.println("less than");
            }
            else {
                System.out.println("greater ");
            }
        }
        sc.close();
    }
}
