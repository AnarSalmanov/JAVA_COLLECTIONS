package Set_interface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_ {
    /**
     * ----------- LinkedHashSet ----------
     * LinkedHashSet - is a class implementing to Set interface.
     * LinkedHashSet internally uses LinkedHashMap's key part.
     * LinkedHashSet maintains the added items by insertion order.
     * LinkedHashSet allows only one null objects.
     * LinkedHashSet doesn't allow duplicates.
     */
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<String> set = new LinkedHashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set);
    }


}
