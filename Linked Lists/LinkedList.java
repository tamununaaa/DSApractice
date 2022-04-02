package LinkedList;

//import java.util.*;
//import java.io.*;

public class LinkedList
{
    Node head;                                              //object of class Node that represents the head of the list

    static class Node                                       //static inner class
    {
        String data;                                        //data part of the node
        Node next;                                          //link part of the node(connect each node to next node)

        Node(String s)                                      //default constructor to initialize value
        {
            data = s;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, String data)
    {
        Node newNode = new Node(data);                      //create a node with the given data
        newNode.next = null;                                //point current node to null

        if(list.head == null)                               //if linked list is empty, then make newNode as head
            list.head = newNode;
        
        else                                                //else, traverse the list till the last node and insert newNode there
        {
            Node last = list.head;
            while(last.next != null)
                last = last.next;
            last.next = newNode;
        }

        return list;                                        //return the list (by head)
    }

    public static void print(LinkedList list)               //function to print linked list
    {
        Node currNode = list.head;                          //assign head node to currNode 

        System.out.print("LINKED LIST: ");
        
        while(currNode != null)                             //loop until currNode traverses the entire list and reaches last node
        {
            System.out.print(currNode.data + " ");          //print data at current node
            currNode = currNode.next;                       //go to next node
        }   

    }
    public static void main(String args[])
    {
        LinkedList list = new LinkedList();                 //Create an empty linked list

        list = insert(list, "Vanilla");                     //Insert values to linked list
        list = insert(list, "Butterscotch");
        list = insert(list, "Strawberry");
        list = insert(list, "Mint");
        list = insert(list, "Chocolate");

        print(list);                                        //Print linked list
        

    }
}