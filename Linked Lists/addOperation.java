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
        LinkedList<String> list = new LinkedList<String>();       //Create a linked list called 'list' of String type

        list.add("Germany");                                      //Using add(Object) function to add elements at the end of the list
        list.add("Ireland");
        list.add("France");
        list.add("Ukraine");

        System.out.println("ORIGINAL LINKED LIST: ");
        System.out.println(list);                                 //Print the list

        list.add(1,"Luxembourg");                                 //Using add(int index, Object) function to add elements at the specified position
        list.add(3,"New Zealand");

        System.out.println("NEW LINKED LIST: ");
        System.out.println(list);                                //Print the new LinkedList
        
        
        LinkedList<String> list2 = new LinkedList<String>();     //Creating another list
        
        list2.add("Raymond");                                    //Using add(Object) function to add elements at the end of the list
        list2.add("Philip");
        list2.add("Caroline");
        list2.add("Geremy");

        System.out.println("Linked List2: ");
        System.out.println(list2);                               //Print list2

        
        /*Combining list and list2 together can be done in 2 ways:
        1) add list2 at the end of list
        2) add list2 at the specified index
        */
        
        list.addAll(list2);                                      //Add all elements of list2 at the end of list
        System.out.println("NEW COMBINED LINKED LIST: ");        
        System.out.println(list);                                //Print the new LinkedList
        
        list.addAll(0,list2);                                    //Add all elements of list2 at 0th index of list
        System.out.println("NEW COMBINED LINKED LIST AT 0th INDEX: ");        
        System.out.println(list);                                //Print the new LinkedList
        
        
        /*Elements can be added specifically at the beginning or end of the LinkedList, using:
        1) addFirst()
            2) addLast()
        */
        
        list.addFirst("FIRST");                                   //Add element to the starting of list
        list.addLast("LAST");                                     //Add element to the end of list
        System.out.println("FINAL LIST: ");        
        System.out.println(list);                                //Print the final LinkedList
        
        


        
    }
}