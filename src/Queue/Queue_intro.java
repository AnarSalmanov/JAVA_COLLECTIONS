package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_intro {

    /**
     * -------------------- Queue interface --------------------------
     * Queue interface works based on FIFO (first in first out) structure.
     * Most of the cases reference of Queue and Deque interface refers to LinkedList class
     * -> queueName.remove() will remove first added element.;
     * It will remove 1st element in the queue
     */

    public static void main(String[] args) {
        Deque<String> names = new LinkedList<>(); // Cause it implements Deque interface.
        names.add("Anar");
        names.add("Samir");
        names.remove(); // Here it will remove 1st element
        System.out.println(names); // Samir
    }

}
