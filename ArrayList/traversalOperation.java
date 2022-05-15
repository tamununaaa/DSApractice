package ArrayList;

import java.util.*;
import java.util.ArrayList;

public class traversalOperation {
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);                                       //add elements to the
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        //An ArrayList can be traversed over in many ways:
       
        //1. Using Iterator
        Iterator itr = list.iterator();
        System.out.println("Traversing using Iterator: ");
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        
        
        //2. Using Iterator(here, to print reverse ArrayList)
        ListIterator<Integer> it = list.listIterator(list.size());
        System.out.println("Traversing using ListIterator(in reverse order): ");
        while(it.hasPrevious())
        {
            int a = it.previous();
            System.out.print(a + " ");
        }
        System.out.println();
        
        
        //3. Using for-each loop
        System.out.println("Traversing using for-each loop:");
        for(int x:list)
        {
            System.out.print(x + " ");
        }
        System.out.println();


        //4. Using for loop
        System.out.println("Traversing using for loop: ");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        } 

    }
}
