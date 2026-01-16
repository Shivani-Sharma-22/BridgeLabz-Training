import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void insertionSort(int[] empId) {
        for (int i = 1; i < empId.length; i++) {
            int key = empId[i];
            int j = i - 1;
            while (j >= 0 && empId[j] > key) {
            	empId[j + 1] = empId[j];
                j--;
            }
            empId[j + 1] = key;
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of Employees");
		int n = sc.nextInt();
		int[] empId = new int[n];
		System.out.println("Enter the employee ID's: ");
		for(int i =0;i<empId.length;i++) {
			empId[i] = sc.nextInt();
		}
		insertionSort(empId);
		System.out.println("Insertion Sort: "+Arrays.toString(empId));
	}
}
