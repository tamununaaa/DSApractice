package LinkedList.LinkedListOperations;
import java.util.*;
public class reverseOperation {
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Mushroom");
        list.add("Zucchini");
        list.add("Broccoli");
        list.add("Jalapenos");

        Iterator<String> itr = list.descendingIterator();
        while(itr.hasNext())
            System.out.print(itr.next() + " ");
    }
    
}
