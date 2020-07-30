package Maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_ {
    /**
     * ------------------------ TreeMap ----------
     * TreeMap class implementing Map interface.
     * Does not allow duplicate keys and null keys.
     * Map's key is case sensitive.
     * If key is not there, will return null.
     * TreeMap maintains objects by key ascending order.
     */

    public static void main(String[] args) {
        Map<Integer, String> names = new TreeMap<>();
        names.put(5, "Anar");
        names.put(2, "Xezer");
        names.put(3, "Samir");
        System.out.println(names);  // {2=Xezer, 3=Samir, 5=Anar}
    }
}
