/*
There are multiple ways to iterate through LinkedList. Two most commonly used ways are:
    1)get() method: to get the element at a specific index and the advanced for-loop
    2)for-loop
    2)iterator() of Iterator class
*/
package LinkedList.LinkedListOperations;
import java.util.*;
public class iterationOperations {
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();             //Create a linked list called 'list' of String type

        list.add("Germany");                                            //Using add(Object) function to add elements at the end of the list
        list.add("Ireland");
        list.add("France");
        list.add("Ukraine");
        list.add("Luxembourg");                                                         
        list.add("New Zealand");

        //Using get() function
        for(int i=0; i<list.size();i++)
            System.out.print(list.get(i) + " ");
        
        System.out.println();
        
        //Using for-loop
        for (String str : list)
        System.out.print(str + " ");
        
        System.out.println();

        //Using iterator() of Iterator class
        Iterator<String> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }

    }
}