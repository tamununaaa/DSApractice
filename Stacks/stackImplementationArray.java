package Stacks;
import java.util.*;
class Stack                                                     //Create a class Stack with various methods
{
    int top = -1;                                               //top is set as -1 (as stack is empty right now)
    int max = 10;                                               //Set maz siz of array as 10 
    int[] arr = new int[max];                                   //Declare array of size 'max'

    Stack()                                                     //Default constructor to assign top as -1
    {
        top = -1;
    }

    boolean isEmpty()                                           //return TRUE if top<0 and FALSE if top>=0
    {
        return (top<0);
    }

    boolean push(Scanner sc)                                    //Method to push elements into the stack
    {
        if(top == max-1)                                        //Check if stack is full (top points to max size)
        {
            System.out.println("STACK OVERFLOW!");           //Declare OVERFLOW
            return false;                               
        }
        else                                                    //If not OVERFLOW
        {
            int val = sc.nextInt();                             //Take user input to push elements
            top++;                                              //Increment top after adding element
            arr[top] = val;                                     //Assign value to top of array
            System.out.println("Element pushed.");  
            return true;
        }
    }

    boolean pop()                                               //Method to pop elements from stack
    {
        if(top==-1)                                             //Check if top is pointing to -1
        {
            System.out.println("STACK UNDEFLOW!");            //Declare UNDERFLOW
            return false;
        }
        else                                                    //If not UNDERFLOW
        {
            top--;                                              //Decrement top of stack
            System.out.println("Element popped.");
            return true;
        }
    }

    void display()                                              //Method to display the stack
    {
        System.out.println("Stack: ");
        for(int i=top;i>=0;i--)
            System.out.println(arr[i]);
    }

}
public class stackImplementationArray {
    public static void main(String args[])
    {
        Stack s = new Stack();                                  //Create stack
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 elements to push: ");    
            s.push(sc);
            s.push(sc);
            s.push(sc);

        
        System.out.println("Stack is empty: " + s.isEmpty());

        System.out.println("Pop element -> " + s.top);
        s.pop();
        
        System.out.println("Display stack: ");
        s.display();

        System.out.println("Stack is empty: " + s.isEmpty());
    }
}
