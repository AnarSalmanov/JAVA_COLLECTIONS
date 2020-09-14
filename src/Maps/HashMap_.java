package Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap_ {


    /**
     * ------------------------ HashMap class ---------------------------------
     * HashMap class implements to Map interface.
     * Does not allow duplicate keys.
     * Allows only 1 null key, n number null value.
     * If try to add 2nd null key , then compiler will compile but will overridden the existing one.
     * Map's key is case sensitive.
     * If key is not there, will return null.
     * Hashmap maintains object by keys random order.
     */

    public static void main(String[] args) {
        Map<String, Double> items = new HashMap<>();
        items.put("cheese", 3.50);
        items.put("beets", 2.48);
        items.put("potato", 4.70);
        items.put(null, 3.49);
        items.put(null, 3.6);
        System.out.println(items);

        /*   .size()
         returns length of the map
         */
        System.out.println(items.size());  // -> 4

        /*        .get(key)
         returns the value of certain key
         returns null if key is not there.
         */
        System.out.println(items.get("potato"));   //-> 4.70
        System.out.println(items.get("tomato")); // -> null

        /*        .isEmpty()
        returns boolean , true/false
         */

        /*        .remove(key)
         removes by key  / value pair
         */
        items.remove("cheese");
        System.out.println(items);  // -> cheese removed with its value

        /*        .containsKey(key)
         checks whether Map contains certain key or not, returns boolean
         */
        System.out.println(items.containsKey("cucumber")); // --> false

        /*        .replace(key , newValue)
         replaces current value of given key to the new one.
         */
        items.replace("potato", 5.50);
        System.out.println(items.get("potato"));  //-> 5.50
        // increase/modify the value
        items.replace("potato", items.get("potato") + 2);
        System.out.println(items.get("potato")); // -> 7.50;


    }


}
