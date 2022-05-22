package Stacks;
import java.util.*;
class Node                                          //Create a class Node
{
    int data;
    Node next;

    public Node()                                   //Default constructor to initialise values to the node
    {
        data = 0;
        next = null;
    }

    public Node(int d, Node n)                      //Parameterized constructor to initialise values to the node
    {
        this.data = d;
        this.next = n;
    }

    public void setNext(Node n)                     //Function to set link to next node
    {
        this.next = n;
    }

    public void setData(int d)                      //Function to set data to current node
    {
        this.data = d;
    }

    public Node getNext()                           //Function to get link of next node
    {
        return next;
    }

    public int getData()                            //Function to get data of current node
    {
        return data;
    }
}

class linkedStack                                   //Create a class linkedStack with operations on Stack
{
    Node top;
    int size;

    public linkedStack()                            //Constructor to initialise default values
    {
        top = null;
        size = 0;
    }

    public boolean isEmpty()                        //Method to check if stack is empty
    {
        return (top == null);                       //Return 'true' if top is null, i.e., stack is empty
    }

    public int getSize()                            //Method to get size of stack
    {
        return size;
    }

    public void push(int data)                      //Method to push elements into the stack
    {
        Node newNode = new Node(data,null);      //Initialise the newNode
        if(top == null)                            //Check if top is null i.e., stack is empty
            top = newNode;                         //The newNode becomes top 
        else                                       //If element already exists
        {
            newNode.setNext(top);                  //Next of newNode points to top
            top = newNode;                         //The newNode becomes top
        }
        size++;                                    //Increment size by 1
    }

    public int pop()                               //Method to pop elements from the stack 
    {
        if(isEmpty())                              //If stack is empty
            System.out.println("UNDERFLOW!");   //UNDERFLOW CONDITION
        Node current = top;                       //Otherwise, current node points to top
        top = current.getNext();                  //top will point to current's next node
        size--;                                   //Decrement size of stack
        return (current.getData());               //Return data of current node- that is popped
    }
    
    public int peek()                             //Method to get the element at the top of the stack
    {
        if(isEmpty())                             //If stack is empty
            System.out.println("UNDERFLOW!");  //UNDERFLOW CONDITION
        return top.getData();                    //Return data of top element
    }

    public void display()                        //Method to display elements of the stack
    {
        if(size<=0)                              //If stack is empty
        {
            System.out.println("Stack is empty");
            return;                              //Show message and return
        }
        Node current = top;                      //Current node will point to top
        while(current!=null)                        
        {
            System.out.println(current.getData());
            current = current.getNext();         //Current points to the next node
        }
    }
}

public class stackimplementationLL {
    public static void main(String args[])  
    {
        Scanner sc = new Scanner(System.in);
        linkedStack ls = new linkedStack();     //Create stack

        System.out.println("Enter 4 elements to push in the stack: ");
        ls.push(sc.nextInt());
        ls.push(sc.nextInt());
        ls.push(sc.nextInt());
        ls.push(sc.nextInt());

        System.out.println("Display Stack: ");
        ls.display();
        
        System.out.println("Remove top: " + ls.peek());
        ls.pop();
        System.out.println("Display Stack: ");
        ls.display();

        System.out.println("Stack top: " + ls.peek());
        
        System.out.println("Stack empty? " + ls.isEmpty());
        
        System.out.println("Stack size: " + ls.getSize());


        


    }    
}
