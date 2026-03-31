package ListInterface;
import java.util.*;
public class FrequencyOfElement {

	public static void main(String[] args) {
		List<String> input = Arrays.asList(
		        "apple", "banana", "apple", "orange"
		);

		HashMap<String, Integer> freqMap = new HashMap<>();

		for (String item : input) {
		    if (freqMap.containsKey(item)) {
		        freqMap.put(item, freqMap.get(item) + 1);
		    } else {
		        freqMap.put(item, 1);
		    }
		}

		System.out.println(freqMap);

		
	}
}
