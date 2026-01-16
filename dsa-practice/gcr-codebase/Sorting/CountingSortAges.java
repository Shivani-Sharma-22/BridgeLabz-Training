import java.util.Arrays;
import java.util.Scanner;

public class CountingSortAges {

    public static void countingSort(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        int[] count = new int[max - min + 1];

        for (int value : arr) {
            count[value - min]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No.");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter the Price:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        countingSort(ages);
        System.out.println(Arrays.toString(ages));
    }
}
