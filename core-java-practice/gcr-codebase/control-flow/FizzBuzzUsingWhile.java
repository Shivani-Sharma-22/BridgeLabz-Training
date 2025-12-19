import java.util.Scanner;

public class FizzBuzzUsingWhile {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner sc = new Scanner(System.in);
        //taking input from user
        int number = sc.nextInt();
        int i =1;
        if(number > 0){
            while (i<=number) {

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
                i++;
            }
        }
    }
}
