package Iterator_interface;

import java.util.*;

public class Iterator_intro {


    /**
     * ------------------ Iterator interface -----------------------------
     * We use Iterator interface to iterate the List and Sets
     * We create an object of iterator.
     * we are using  -->  Iterator<Object> it = listName/setName.iterator();
     * hasNext()- will return true if the List/Set not empty , otherwise will return false
     * next() - will return current value in the List/Set and moves to next value.
     * remove() - removes the value from List/Set
     */

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        Set<Integer> numSet = new LinkedHashSet<>(numList);
        Iterator<Integer> numIt = numSet.iterator();
        while (numIt.hasNext()) {
            System.out.println(numIt.next());
        }
    }

}
