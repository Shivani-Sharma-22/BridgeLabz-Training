package ListInterface;

import java.util.*;

public class ReverseList {
	public static void main(String[] args) {
		//reversed ArrayList
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
        
		int start =0;
		int end = arr.size()-1;
		
		while(start < end) {
			int temp = arr.get(start);
			arr.set(start, arr.get(end));
			arr.set(end, temp);
			
			start++;
			end--;
		}
		//reversed LinkedList
		 System.out.println("Reversed ArrayList: " + arr);
		 LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
	        LinkedList<Integer> reversedList = new LinkedList<>();

	        ListIterator<Integer> iterator = list.listIterator(list.size());

	        while (iterator.hasPrevious()) {
	            reversedList.add(iterator.previous());
	        }

	        System.out.println("Reversed LinkedList: " + reversedList);
	}
}
