package List_interface;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_ {

	/**                     LINKEDLIST
	 * LinkedList - is a class implementing to List and Deque interface. So that Linkedlist
	 * gives us more methods to use than the ArrayList. Maintains added elements by order.
	 * ArrayList internally uses Array.Linkedlist is better in adding and removing.
	 *                     
	 */

	public static void main(String[] args) {

		// way 1
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(10);
        list.add(null);
        list.add(null);

		boolean result = list.contains(10);
		System.out.println(list.toString());
		System.out.println(result);   // true

		// Way 2
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(5);
		list2.add(30);
		System.out.println(list2.get(0));

	
		
		/**                .ADDFIRST()
		 * Ads the specifiv element to 1 st position in the list
		 */
		   list2.addFirst(45);
		System.out.println(list2.get(0));  // -> 45 
		
		
		
		/**                .ADDLAST()
		 * Ads the specifiv element to last position in the list
		 */
		   list2.addLast(90);
		System.out.println(list2.get(list2.size()-1));  // -> 90
		
	
		
		/**               .GETFIRST() 
		 * Gets the first element in the list.                          
		 */
		
		int first = list2.getFirst();
		System.out.println(first);
		
		

		/**               .GETLAST() 
		 * Gets the last element in the list.                          
		 */
		int last = list2.getLast();
		System.out.println(last);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
