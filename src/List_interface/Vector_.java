package List_interface;

import java.util.*;

public class Vector_ {

    /**
     * -------------------- Vector -------------------------
     * Vector class implements to List Interface.
     * Vector is also using Array internally.
     * Pretty much same with Arraylist and LinkedList.
     * Vector is thread safe and Synchronized.
     * Vector allows n number null and n number duplicates values.
     */

    public static void main(String[] args) {
        List<String> items = new Vector<>(Arrays.asList(new String[]{"Xose", "Samir"}));
        Vector<Integer> numbers = new Vector<>(Arrays.asList(new Integer[]{1, 2, 3, 4}));
        items.add("water");
        System.out.println(items);

    }


}
