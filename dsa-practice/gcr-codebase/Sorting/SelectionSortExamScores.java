import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortExamScores {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.");
		int n = sc.nextInt();
		int[] scores = new int[n];
		System.out.println("Enter the Price: ");
		for(int i =0;i<scores.length;i++) {
			scores[i] = sc.nextInt();
		}
		selectionSort(scores);
		System.out.println("Insertion Sort: "+Arrays.toString(scores));
	}
}
