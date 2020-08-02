package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_ {

    /**
     * ------------- LinkedHashMap class ------------------------
     * LinkedHashMap class extends HashMap class (HashMap implements to Map interface)
     * Does not allow duplicate keys.
     * Allows only 1 null key, any number null value.
     * If try to add 2nd null key , then compiler will compile but will overridden the existing one.
     * Map's key is case sensitive.
     * If key is not there, will return null.
     * LinkedHashMap maintains object by keys insertion order.
     */

    public static void main(String[] args) {
        Map<String, Integer> names = new LinkedHashMap<>();
        names.put("Anar", 5);
        names.put("Samir", 6);
        names.put("Xezer", 7);
        names.put("Ferhad", 8);
        System.out.println(names);


    }


}
