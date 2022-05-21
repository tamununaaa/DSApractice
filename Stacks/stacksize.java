//The size() method returns the size of the stack
package Stacks;
import java.util.*;
public class stacksize {
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();         //Create a stack of Integer type
        System.out.println(stack.size());             //Print size of stack
       
        stack.push(20);                         //Push elements in the stack
        stack.push(40);
        stack.push(60);
        stack.push(80);

        System.out.println(stack.size());            //Print size of stack
    }
}
