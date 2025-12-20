import java.util.Scanner;

public class SumOfNNathuralNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum =0;
        if(number >0){
            sum = number * (number+1) / 2;
        }
        System.out.println(sum);

    }
}
