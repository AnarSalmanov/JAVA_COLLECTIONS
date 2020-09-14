package List_interface;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_ {

    /**
     * --------------------- LinkedList -----------------
     * LinkedList - is a class implementing to List and Deque interface.
     * As ArrayList internally uses Array.
     * Maintains added elements by insertion order.
     * Accepts n number null values and n number duplicates
     * LinkedList is better in adding and removing.Has 6 extra methods.
     * Non-tread safe and synchronized.
     * NOTE: LinkedList<Integer> list2 = new LinkedList<>(); gives extra methods.
     * .addFirst()
     * .getFirst()
     * .addLast()
     * .getLast()
     * .removeFirst()
     * .removeLast()
     */

    public static void main(String[] args) {

        // way 1
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(10);
        list.add(null);
        list.add(null);

        boolean result = list.contains(10);
        System.out.println(list.toString());
        System.out.println(result);   // true

        // Way 2
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.add(30);
        System.out.println(list2.get(0));


        /**                .addFirst()
         * Ads the specify element to 1 st position in the list
         */
        list2.addFirst(45);
        System.out.println(list2.get(0));  // -> 45


        /**                .addLast(value)
         * Ads the specify element to last position in the list
         */
        list2.addLast(90);
        System.out.println(list2.get(list2.size() - 1));  // -> 90


        /**               .getFirst()
         * Gets the first element in the list.
         */

        int first = list2.getFirst();
        System.out.println(first);


        /**               .getLast()
         * Gets the last element in the list.
         */
        int last = list2.getLast();
        System.out.println(last);


    }


}
