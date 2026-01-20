import java.util.Arrays;

public class SearchComparison {

	//Linear Search
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target)
                return i;
        return -1;
    }
    //Binary Search
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    //main method
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++)
                arr[i] = i;

            int target = size - 1;

            long start = System.nanoTime();
            linearSearch(arr, target);
            long linearTime = System.nanoTime() - start;

            Arrays.sort(arr);

            start = System.nanoTime();
            binarySearch(arr, target);
            long binaryTime = System.nanoTime() - start;

            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
            System.out.println();
        }
    }
}
