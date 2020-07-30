package Set_interface;

import java.util.*;

public class TreeSet_ {


    /**
     * -------------- TreeSet ----------
     * TreeSet is a Class implementing to Set and SortedSet Interface.
     * TreeSet internally uses TreeMap's key part.
     * TreeSet maintains the added items by ascending order.
     * TreeSet doesn't allow any null values and duplicates.
     */


    public static void main(String[] args) {
        TreeSet<Integer> digits = new TreeSet<>();
        Set<Integer> set = new TreeSet<>();
        SortedSet<Integer> sorted = new TreeSet<>();
        sorted.add(5);
        sorted.add(7);
        System.out.println(sorted); // Will sort


    }
}
