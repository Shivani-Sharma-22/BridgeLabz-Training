package SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));
		// UNION
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // INTERSECTION
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        
        union.removeAll(intersection);
        System.out.println("Symmetric Diffrence: "+union);
	}
}
