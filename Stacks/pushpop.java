package Stacks;
import java.util.*;
public class pushpop {
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<Integer>();         //Create stack of Integer type
        stack.push(200);                               //Add elements using push() method
        stack.push(300);                              
        stack.push(400);
        stack.push(500);
        stack.push(600);

        System.out.println(stack);                          //Print stack

        stack.pop();                   //Remove TOP element from the stack 
        System.out.println(stack);                          //Print stack
    }
    
}
