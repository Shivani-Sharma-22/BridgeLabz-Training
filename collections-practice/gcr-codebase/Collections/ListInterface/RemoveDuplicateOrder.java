package ListInterface;
import java.util.*;
public class RemoveDuplicateOrder {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
		Set<Integer> set = new HashSet<>();
		List<Integer> result = new ArrayList<>();
		System.out.println("List before remove duplicates: "+ls);
		for(int i:ls) {
			if(!set.contains(i)) {
				set.add(i);
				result.add(i);
			}
		}
		System.out.println("List after Remove duplicates: "+result);
		
	}
}
