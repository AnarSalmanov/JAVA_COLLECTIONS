package List_interface;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Stack_ {

    /**
     * -------------------- Stack ----------------
     * Stack is a class inherits from Vector class. (extends Vector)
     * Works based on LIFO, Last in First Out.
     */

    public static void main(String[] args) {
        Stack<Integer> numberList = new Stack<>();
        numberList.add(4);
        Vector<Integer> numberList2 = new Stack<>();
        List<String> names = new Stack<>();
        names.add("Xose");
        System.out.print(numberList + "\n" + names);


    }
}
