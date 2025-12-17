import java.util.*;
class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
    }
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev =0;
        while(x> 0){
            int lstdigit = x % 10;
            rev = (rev * 10) + lstdigit;
            x /= 10;
        }
        if(temp == rev){
                return true;
        }
        return false;
    }
}