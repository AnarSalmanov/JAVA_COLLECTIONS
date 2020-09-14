package Maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_ {

    /**
     * ------------------------ Hashtable ----------------------
     * Hashtable is a class implements Map interface.
     * Does not allow duplicate keys and null keys.
     * Map's key is case sensitive.
     * If key is not there, will return null.
     * In case of adding null key, in runtime will give NullPointer exception.
     */

    public static void main(String[] args) {
        Map<String, Integer> names = new Hashtable<>();
        names.put("Anar", 13);
        names.put(null, 10);  //
        System.out.println(names.get("Anar"));
        System.out.println(names.get("xose")); // will give value null.


    }
}
