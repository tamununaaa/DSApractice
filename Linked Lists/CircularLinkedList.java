package LinkedList.LinkedListTypes;

import java.net.NoRouteToHostException;
import java.util.*;
public class CircularLinkedList {
    class Node                                                       //Represents node of the circular linked list
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }

    Node head = null, tail = null;                                   //Head and Tail of the circular linked list

    public void add(int data)                                        //Method to add new node at the end of the circular linked list
    {
        Node newNode = new Node(data);                               //Create new node
        if(head==null)                                               //Check if list is empty
        {
            head = tail = newNode;                                   //Head and tail point to new node
            newNode.next = head;                                     //New node's next will point to head (as it is circular linked list)
        }
        else                                                         //If list is not emmpty
        {
            tail.next = newNode;                                     //Tail's next will point to new node
            tail = newNode;                                          //The new node will become tail
            tail.next = head;                                        //Tail's next will point to head (as it is circular linked list)
        }
    }

    public void display()
    {
        Node current = head;                                         //Current node will point to head
        if(head == null)                                             //If head points to null
        {
            System.out.println("List is empty!");                 //Print message- list is empty
            return;
        }
        else                                                         //If list is not empty
        {
            System.out.println("Nodes: ");                        //Print the nodes of the circular linked list
            do{   
                System.out.println(current.data + " ");              //Print each node
                current = current.next;                              //By incrementing each node
            }while(current != head);                                 
        }
    }

    public static void main(String args[])
    {
        CircularLinkedList clist = new CircularLinkedList();         //Create Circular Linked List
        clist.add(100);
        clist.add(200);
        clist.add(300);

        clist.display();
    }

    
}
