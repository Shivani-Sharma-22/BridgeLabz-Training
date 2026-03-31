package SetInterface;

import java.util.*;

public class ChecksTwoSet {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,1));
		
		if(set1.equals(set2)) {
			System.out.println("Both set are equals");
		}
		else {
			System.out.println("Both are not equals");
		}
		
	}
}
