import java.util.Scanner;

public class MultiplicationTable6TO9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int number = sc.nextInt();
        int index = 0;
        for(int i =6;i<=9;i++){
            arr[index] = number*i;
            index++;
        }
        //display result
        index =0;
        for(int i =6;i<=9;i++){
            System.out.println(number + " * " + i + " = " + arr[index]);
            index++;
        }
        sc.close();
    }
}
