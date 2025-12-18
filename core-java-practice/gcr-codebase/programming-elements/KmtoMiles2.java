import java.util.Scanner;

public class KmtoMiles2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int km=sc.nextInt();
        int miles=(int) (0.621371*km);
        System.out.print("The distance "+km+"to miles is "+ miles);
    }
}
