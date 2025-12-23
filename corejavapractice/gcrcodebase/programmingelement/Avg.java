import java.util.*;

public class Avg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.print("Average of 3 numbers: "+(num1+num2+num3)/3);
        sc.close();
    }
}
