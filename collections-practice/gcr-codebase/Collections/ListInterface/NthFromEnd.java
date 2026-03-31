package ListInterface;
import java.util.*;
public class NthFromEnd {
	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
		int n =2;
		Iterator<String> fast = ls.iterator();
        Iterator<String> slow = ls.iterator();
        
        //move fast n
        for(int i =0;i<n;i++) {
        	if(fast.hasNext()) {
        		fast.next();
        	}
        }
        while(fast.hasNext()) {
        	fast.next();
        	slow.next();
        }
        System.out.println("Find Nth Element: "+slow.next());
	}
}
