/*
In order to add an element to an ArrayList, we can use the add() method that is overloaded to perform 
multiple operations based on different parameters. They are:  
    1) add(Object): This method is used to add an element at the end of the LinkedList.
    2) add(int index, Object): This method is used to add an element at a specific index in the LinkedList.
*/

package LinkedList.LinkedListOperations;
import java.util.*;
class LinkedListOperations{

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();     //Create a linked list called 'list' of String type

        list.add("Germany");                                    //using add(Object) function to add elements at the end of the list
        list.add("Ireland");
        list.add("France");
        list.add("Ukraine");

        System.out.println("ORIGINAL LINKED LIST: ");
        System.out.println(list);                                 //Print the list

        list.add(1,"Luxembourg");                               //Using add(int index, Object) function to add elements at the specified position
        list.add(3,"New Zealand");

        System.out.println("NEW LINKED LIST: ");
        System.out.println(list);                               //Print the new LinkedList
        
    }
}