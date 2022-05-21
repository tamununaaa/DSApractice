package Stacks;
import java.util.*;
public class emptyMethod {
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();

        boolean res = stack.empty();
        System.out.println("The stack is empty? " + res);
        
        stack.push(200);
        stack.push(201);
        
        res = stack.empty();
        System.out.println("The stack is empty? " + res);


    }
}
