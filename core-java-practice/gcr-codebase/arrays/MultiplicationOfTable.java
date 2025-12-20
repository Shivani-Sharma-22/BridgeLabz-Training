import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] mulTable = new int[11];

        for(int i =1;i<=10;i++){
            mulTable[i] = number*i;
            System.out.println("number * "+ i+" = "+ mulTable[i]);
        }
        sc.close();
    }
}
