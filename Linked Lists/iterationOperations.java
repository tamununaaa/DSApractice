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

        //An ArrayList can be traversed over in many ways:


        //1. Using Iterator
        Iterator<String> itr = list.iterator();
        System.out.println("Traversing using Iterator:");
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        
        //2. Using for-each loop
        System.out.println("Traversing using for-each loop:");
        for(String x:list)
        {
            System.out.print(x + " ");
        }
        System.out.println();


        //3. Using for loop
        System.out.println("Traversing using for loop: ");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        } 


    }
}