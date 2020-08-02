package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_intro {

    /**
     * -------------------- Queue interface --------------------------
     * Queue interface works based on FIFO (first in first out) structure.
     * Most of the cases reference of Queue and Deque interface refers to LinkedList class
     * We declare to be removed element as String/int toBeRemoved = queueName.remove();
     * It will remove 1st element in the queue
     */

    public static void main(String[] args) {
        Deque<String> names = new LinkedList<>();
        names.add("Anar");
        names.add("Samir");
        String toBeRemoved = names.remove(); // Here it will remove 1st element
        System.out.println(names); // Samir
    }

}
