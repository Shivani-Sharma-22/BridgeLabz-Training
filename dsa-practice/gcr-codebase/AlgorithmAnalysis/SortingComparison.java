import java.util.Random;

public class SortingComparison {
	
	//Bubble Sort
	static void bubbleSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	}
	//Merge Sort
	static void mergeSort(int[] arr,int left,int right) {
		if (left < right) {
	        int mid = (left + right) / 2;
	        mergeSort(arr, left, mid);
	        mergeSort(arr, mid + 1, right);
	        merge(arr, left, mid, right);
	    }
	}
	static void merge(int[] arr, int left, int mid, int right) {
	    int n1 = mid - left + 1;
	    int n2 = right - mid;

	    int[] leftArray = new int[n1];
	    int[] rightArray = new int[n2];

	    for (int i = 0; i < n1; i++)
	        leftArray[i] = arr[left + i];

	    for (int j = 0; j < n2; j++)
	        rightArray[j] = arr[mid + 1 + j];

	    int i = 0, j = 0, k = left;

	    while (i < n1 && j < n2) {
	        if (leftArray[i] <= rightArray[j])
	            arr[k++] = leftArray[i++];
	        else
	            arr[k++] = rightArray[j++];
	    }

	    while (i < n1)
	        arr[k++] = leftArray[i++];

	    while (j < n2)
	        arr[k++] = rightArray[j++];
	}

	static void quickSort(int[] arr, int low, int high) {
	    if (low < high) {
	        int pi = partition(arr, low, high);
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
    //Quick Sort
	static int partition(int[] arr, int low, int high) {
	    int pivot = arr[high];
	    int i = low - 1;

	    for (int j = low; j < high; j++) {
	        if (arr[j] < pivot) {
	            i++;
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }

	    int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;

	    return i + 1;
	}
	static int[] generateArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(size);
        return arr;
    }
	public static void main(String[] args) {
	    int[] sizes = {1000, 10000};

        for (int size : sizes) {
            int[] small = generateArray(size);
            int[] medium = small.clone();
            int[] large = small.clone();

            long start, time;

            start = System.nanoTime();
            bubbleSort(small);
            time = System.nanoTime() - start;
            System.out.println("Bubble Sort (" + size + "): " + time / 1_000_000.0 + " ms");

            start = System.nanoTime();
            mergeSort(medium, 0, medium.length - 1);
            time = System.nanoTime() - start;
            System.out.println("Merge Sort (" + size + "): " + time / 1_000_000.0 + " ms");

            start = System.nanoTime();
            quickSort(large, 0, large.length - 1);
            time = System.nanoTime() - start;
            System.out.println("Quick Sort (" + size + "): " + time / 1_000_000.0 + " ms");

            System.out.println();
        }
    
	}

}
