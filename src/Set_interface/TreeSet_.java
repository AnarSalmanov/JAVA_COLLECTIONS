package Set_interface;
import java.util.*;

public class TreeSet_ {
	
	
	/**                   TREESET
	 * TreeSet is a Class implementing to SortedSet Interface.
	 * TreeSet maintains the added items by ascending order, it sorts automatically.
	 */
	
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(15,7,11,56,4,5,18); // direct without array braces
		Set <Integer> listToTreeSet = new TreeSet<>(nums);
        System.out.println(listToTreeSet.toString());
        
        
        
		
	}
}
