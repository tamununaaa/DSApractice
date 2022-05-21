/*
    The empty() method returns a boolean value.
    1. If the stack is empty, it returns TRUE.
    2. If the stack is not empty, it returns FALSE.
*/

package Stacks;
import java.util.*;
public class emptyMethod {
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();                   //Create stack of Integer type

        boolean res = stack.empty();                            //res is a boolean indicating whether stack is empty or not
        System.out.println("The stack is empty? " + res);       //Print result- true or false
        
        stack.push(200);                                  //Push elements in the stack
        stack.push(201);

        res = stack.empty();                                   //res is a boolean indicating whether stack is empty or not
        System.out.println("The stack is empty? " + res);      //Print result- true or false

    }
}
