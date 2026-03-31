package leetcodecodebase;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num));
    }
    public static int reverse(int num) {
        int rev =0;
        while(num != 0){
            int lst = num % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = (rev*10) + lst;
            num /= 10;
        }
        return rev;
    }
}
