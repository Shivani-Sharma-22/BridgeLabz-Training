package ListInterface;
import java.util.*;
public class RotateElement {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
		int k =4;
		int n = ls.size();
		k =k%n;
		List<Integer> rotateList = new ArrayList<>();
		//Add element from k to n
		for(int i =k;i<n;i++) {
			rotateList.add(ls.get(i));
		}
		//add first k element at the end
		for(int i =0;i<k;i++) {
			rotateList.add(ls.get(i));
		}
		System.out.println("Rotated Array: "+ rotateList);
	}
}
