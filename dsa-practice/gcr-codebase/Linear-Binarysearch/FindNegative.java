import java.util.*;

public class findNegative {
    public static int findNegative(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int res = findNegative(arr);
        if(res == -1) System.out.println("No negative number found");
        else System.out.println("First negative number at index: " + res);
    }
}
