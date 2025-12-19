import java.util.*;
public class MultiplicationOfNumber {
    public static void main(String[] args) {
        //Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        //Taking input a number from user
        int number = sc.nextInt();

        for(int i =6;i<=9;i++){
            System.out.println(number +" * " + i + "= "+ number * i);
        }
    }
}
