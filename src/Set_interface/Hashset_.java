package Set_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Hashset_ {
	 
	/**                 HashSet
	 * HashSet - is a class implementing to Set interface.
	 * HashSet internally uses HashMap's key part.
	 */

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		System.out.println();
		
		// Converting List to Set
		ArrayList< Integer > nums = new ArrayList<>(Arrays.asList(new Integer [] {4,6,2,8,22,6,2,4}));
		Set<Integer> uniqueNums = new HashSet<>(nums);
		System.out.println(uniqueNums.toString());
		
		
		
		
		
		
		
	}
	
	
	
	
}
