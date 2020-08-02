package Maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_ {

    /**
     * ------------------------ TreeMap class --------------------
     * TreeMap class implements to SortedMap interface (SortedMap interface extends to Map interface).
     * Does not allow duplicate keys and null keys. (If add null key will throw NullPointer Exception when runs)
     * Map's key is case sensitive.
     * If key is not there, will return null.
     * TreeMap maintains objects by key ascending order.
     */

    public static void main(String[] args) {
        Map<Integer, String> names = new TreeMap<>();
        names.put(5, "Anar");
        names.put(2, "Xezer");
        names.put(3, "Samir");
        //names.put(null, "xxx"); // cant,be
        System.out.println(names.get(4));  //null
        System.out.println(names);

    }
}
