package Collection_Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Framework_Intro {
                                                
	/**              Collection Framework
	 * Collection Framework consist of hierarchy of Interfaces.
	 * Each interface has multiple implementing classes.
	 * Collection frameworks coming from Java.util package.
	 * 
	 *                    
	 *                    INTERFACES
	 *                    
	 * ITERABLE > COLLECTION > LIST 
	 *                       > SET   > SORTEDSET
	 *                       > QUEUE > DEQUE
	 *                       
	 * 
	 * MAP > HashMap
	 *     > HashTable
	 *     > SortedMap> TreeMap
	 * 
	 * 
	
	                       
	 *                             LIST                      
	 * ITERABLE > COLLECTION > LIST > ArrayList
	 *                              > LinkedList
	 *                              > Vector > Stack
	 *                             
	 *                             
	 *                             
	 *                             SET 
	 * ITERABLE > COLLECTION > SET > HashSet
	 *                              > SortedSet > TreeSet
	 *                                                      
	 *                             
	 *                             
	 *                             
	 *                             
	 *               LIST VS SET VS MAP VS QUEUE
	 * 
	 *  LIST - is ordered and Indexed Collection, may contain dupplicates and multiple null values.
	 * 
	 *  SET - Collection of uniqe values, not ordered (random).
	 *  
	 *  QUEUE - FIFO, First in First out.
	 *  
	 *  MAP - Key and value pair. KEys can't be dupplicate, not ordered.(random)
	 *  
	 
	                 		          
	                 		          ITERATOR INTERFACE
	/**
	 * We use Iterator interface to iterate the List and Sets.We create an object of iterator.
	 * we are using  -->  Iterator<Object> it = List/Set.iterator();
	 * hasNext()- will return true if the List/Set not empty , otherwise will return false
	 * next() - will return current value in the List/Set and moves to next value.
	 * remove() - removes the value from List/Set
      
     */
		
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<>(Arrays.asList(new Integer [] {1,2,3,4,5,7,8,8}));
		System.out.println(maximum(list));
	}
	
	public static int maximum(ArrayList<Integer> numbers) {
		Integer maxNum = Collections.max(numbers);  //8
        numbers.removeAll(Arrays.asList(maxNum) );
        int secondMax= Collections.max(numbers) ;
        return secondMax;
	}
	
}
