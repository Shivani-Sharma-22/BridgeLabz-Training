
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        int temp = x;
        int rev = 0;

        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
