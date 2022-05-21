/*
    The search() method returns the position of the element to be searched from the stack. It can return a value in 2 cases:
    1. When element is found: It returns the position of the element (Starting from TOP of stack as 1)
    2. When element is not found: It returns '-1'
*/

package Stacks;
import java.util.*;
public class search {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<>();           //Create stack of String type

        stack.push("Pineapple");                 //Push elements in the stack
        stack.push("Watermelon");
        stack.push("Strawberry");
        stack.push("Grapes");
        stack.push("Peach");

        System.out.println(stack.search("Grapes"));
        System.out.println(stack.search("Peach"));
        System.out.println(stack.search("Banana"));

    }
}
