import java.util.Arrays;
import java.util.Scanner;

public class HeapSortSalaries {
    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) largest = l;
        if (r < n && arr[r] > arr[largest]) largest = r;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.");
		int n = sc.nextInt();
		int[] salaries = new int[n];
		System.out.println("Enter the Price: ");
		for(int i =0;i<salaries.length;i++) {
			salaries[i] = sc.nextInt();
		}
        heapSort(salaries);
        System.out.println(Arrays.toString(salaries));
    }
}
