package List_interface;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Stack_ {

    /**
     * -------------------- Stack ----------------
     * Stack is a class is a sub-class of  Vector class. (Vector implements to List interface)
     * Works based on LIFO, Last in First Out.
     */

    public static void main(String[] args) {
        Stack<Integer> numberList = new Stack<>();
        numberList.add(4);
        Vector<Integer> numberList2 = new Stack<>();
        List<String> names = new Stack<>();
        names.add("Xose");
        names.add("Anar");
        System.out.print(numberList + "\n" + names);


    }
}
