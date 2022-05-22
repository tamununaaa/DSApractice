/*
    Stacks can be iterated over using the following methods:
    1. Iterator()
    2. forEach()
    3. listIterator()    
*/
package Stacks;
import java.util.Stack;
import java.util.*;
public class stackiterator {
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(400);
        stack.push(800);
        stack.push(1200);
        stack.push(1600);

        //1. Using Iterator() method
        System.out.println("Usig Iterator() method: ");
        Iterator<Integer> itr = stack.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
        //2. Using forEach() method
        System.out.println("Usig forEach() method: ");
        stack.forEach(n->{System.out.println(n);});   
        
        //3. Using listIterator() method
        System.out.println("Usig listIterator() method: ");
        ListIterator<Integer> litr = stack.listIterator();
        while(litr.hasNext())
            System.out.println(litr.next());
            
            
        //To iterate on a stack in reverse order, i.e., BOTTOM to TOP
        System.out.println("Usig listIterator() method to print reversed stack: ");
        ListIterator<Integer> revitr = stack.listIterator(stack.size());
        while(litr.hasPrevious())
            System.out.println(revitr.previous());

    }
}