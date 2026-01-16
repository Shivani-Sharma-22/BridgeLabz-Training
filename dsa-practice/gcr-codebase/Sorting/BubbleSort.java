import java.util.Scanner;

class Student{
	int[] marks;
	
	public int[] bubblesSort(int[] marks) {
		int size = marks.length-1;
		
	
		for(int i =0;i<=size;i++) {
			for(int j =0;j<=size-i-1;j++) {
				if(marks[j] > marks[j+1]) {
					int temp = marks[j+1];
					marks[j+1] = marks[j];
					marks[j] = temp;
				}
			}
		}
		return marks;
	}
	public void display(int[] marks) {
		System.out.println("Sorted marks: ");
		for(int i =0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
	}
}
public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of Students: ");
		int n = sc.nextInt();
		int[] marks = new int[n];
		System.out.println("Enter the marks of student");
		for(int i =0;i<n;i++) {
			marks[i] = sc.nextInt();
		}
		Student st = new Student();
		st.bubblesSort(marks);
		st.display(marks);
	}
}
