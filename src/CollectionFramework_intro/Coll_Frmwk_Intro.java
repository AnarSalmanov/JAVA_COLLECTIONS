package CollectionFramework_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Coll_Frmwk_Intro {

	/**              Collection Framework
	 * Collection Framework is an collection of Interfaces.
	 * Each interface has multiple implementing classes.
	 * Collection frameworks comes from Java.util package.
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
	 *  LIST - is ordered and Indexed Collection, may contain duplicates and multiple null values.
	 *
	 *  SET - Collection of unique values, not ordered, only LinkedHashSet is ordered
	 *
	 *  QUEUE - FIFO, First in First out.
	 *
	 *  MAP - Key and value pair. No duplicate key, not ordered , only LinkedHashMap is ordered
     *
     *  ITERATOR - Used for iterating of the List and Set. (mostly set)
	 *
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
