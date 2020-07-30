package Maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_ {

    /**
     * ------------------------ Hashtable ----------
     * Hashtable class implementing Map interface.
     * Does not allow duplicate keys and null keys.
     * Map's key is case sensitive.
     * If key is not there, will return null.
     */

    public static void main(String[] args) {
        Map<String, Integer> names = new Hashtable<>();
        names.put("Anar", 13);
        System.out.println(names.get("Anar"));


    }
}
