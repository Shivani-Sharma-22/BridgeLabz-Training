
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        System.out.println("Reversed number: " + rev);
    }
}

