package CollectionFramework_intro;

import java.util.*;

public class Converting_btw_List_Set {
    /**
     * Converting List to Set and opposite happens using data structures constructors.
     */

    public static void main(String[] args) {
        List<Integer> digitList = new ArrayList<>();
        Set<Integer> digitSet = new LinkedHashSet<>();

        // Convert List to Set
        Set<Integer> listToSet = new HashSet<>(digitList); // List -> Set

        //Convert Set to List
        List<Integer> setToList = new ArrayList<>(digitSet); // Set -> List
    }
}
