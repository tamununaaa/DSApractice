//The peek() method returns the element at the TOP of the stack
package Stacks;
import java.util.*;
import java.util.Stack;
public class peek {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<>();           //Create stack of String type

        stack.push("Pineapple");                 //Push elements in the stack
        stack.push("Watermelon");
        stack.push("Strawberry");

        String top = stack.peek();                    //Access element from the top of the stack
        System.out.println(top);                      //Print element at the top
    }
}
