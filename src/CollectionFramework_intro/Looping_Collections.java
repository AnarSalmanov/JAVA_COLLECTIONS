package CollectionFramework_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Looping_Collections {
	/**
	 * LIST -> ArrayList
	 *      -> Vector -> Stack
	 * 
	 * 1.For each loop 
	 * 2.For loop 
	 * 3.While loop
	 * 4.do while loop 
	 * 5.Iterator
	 * 6.forEach() method--> comes from java 8 (must be used lambda expressions)
	 * 
	 * ---------------------------------------------------------- 
	 * SET -> HashSet ->
	 * SortedSet -> TreeSet
	 * 
	 * 1.for each loop 
	 * 2.Iterator 
	 * 3.forEach() method Lambda expression
	 * 
	 * 
	 */

	public static void main(String[] args) {

		/** ARRAYLIST LOOPING EXAMPLES */

		// 1. - For Each loop

		List<Integer> nums = new ArrayList<>(Arrays.asList(new Integer[] { 5, 235, 7, 54, 77, 4, 788, 9, 588 }));
		nums.add(67);

		Collections.sort(nums); // -> sorting the list

		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();

		// 2. - For loop

		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}
		System.out.println();

		// 3. forEach() method of Java 8
		/**  forEach() method comes from Iterable interface we need to pass Lambda
		 expression
	     Lambda expression is part of Java programming, used to pass an implementation
		 as arguments of method.*/

		nums.forEach(n -> System.out.print(n + " | "));
		System.out.println();

		// 4. Iterator Interface - with wile must!
		Iterator<Integer> it = nums.iterator();
		while (it.hasNext()) {                // hasNext() returns true there is any next element.
			System.out.print(it.next() + " ");
		}
		System.out.println();

		

		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
