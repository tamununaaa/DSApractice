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

        //1. Using listIterator()
        ListIterator<String> it = list.listIterator(list.size());
        System.out.println("Using listIterator(): ");
        while(it.hasPrevious())
        {
            String a = it.previous();
            System.out.print(a + " ");
        }
        System.out.println();   

        //2. Using descendingIterator()
        Iterator<String> itr = list.descendingIterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }

        //3. Using get()
        int n=list.size();
        for(int i=n;i>0;i--)
        {
            System.out.print(list.get(i-1) + " ");
        }

        
    }
    
}
