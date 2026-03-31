package review;
import java.util.Scanner;
import java.util.*;
public class MergeSortExample {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left +(right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] LeftArray = new int[n1];
        int[] RightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            LeftArray[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            RightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j])
                arr[k++] = LeftArray[i++];
            else
                arr[k++] = RightArray[j++];
        }

        while (i < n1)
            arr[k++] = LeftArray[i++];

        while (j < n2)
            arr[k++] = RightArray[j++];
    }
    public static void printArray(int[] arr) {
    	for(int i:arr) {
    		System.out.println(i);
    	}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0;i<n;i++) {
        	arr[i] = sc.nextInt();
        }
        System.out.println("Before sorted..");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorted...");
        printArray(arr);
    }


}
