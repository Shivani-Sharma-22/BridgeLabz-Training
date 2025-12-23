package gcrcodebase.programmingelement;

import java.util.Scanner;

public class BasicCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int addition = number1 + number2;
        int subraction = number1 - number2;
        float div = (number1/number2);
        int mul = number1*number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers  "+addition+","+subraction+","+mul+","+div);
        
    }
}
