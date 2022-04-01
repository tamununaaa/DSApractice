/*
In order to remove an element from a LinkedList, we can use the remove() method that is overloaded to perform 
multiple operations based on different parameters. They are: 
    1) remove(Object): This method is used to simply remove an object from the LinkedList. If there are multiple such objects, 
       then the first occurrence of the object is removed.
    2) remove(int index): Since a LinkedList is indexed, this method takes an integer value which simply removes 
       the element present at that specific index in the LinkedList. After removing the element and the indices 
       of elements are updated so do the object of LinkedList is updated giving a new List after the deletion of element/s.
*/

package LinkedList.LinkedListOperations;
import java.util.*;
public class removeOperation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();             //Create a linked list called 'list' of String type

        list.add("Germany");                                            //Using add(Object) function to add elements at the end of the list
        list.add("Ireland");
        list.add("France");
        list.add("Ukraine");
        list.add("Luxembourg");                                 
        list.add("New Zealand");

        System.out.println("ORIGINAL LINKED LIST: ");
        System.out.println(list);                                       //Print the list
        
        list.remove();                                                  //Removes the first element of the list
        System.out.println("NEW LIST");
        System.out.println(list);                                       //Print the list

        
        list.remove("Ukraine");                                         //Using remove(Object) function to remove the specified element
        
        System.out.println("After removing 'Ukraine': ");
        System.out.println(list);                                       //Print the list
        
        list.remove(3);                                                 //Using remove(int index) function to remove element at specified position
        System.out.println("After removing element at 3rd index: ");
        System.out.println(list);                                       //Print the list

        LinkedList<String> list2 = new LinkedList<String>();            //Creating another linked list        

            list2.add("Orchids");                                       //Using add(Object) function to add elements at the end of the list
            list2.add("Tulips");    
            list2.add("Pansies");
        
            list.addAll(list2);                                         //Add all elements of list2 at the end of list
            
            System.out.println("COMBINED LIST: ");
            System.out.println(list);                                   //Print the list
            
            list.removeAll(list2);                                       //Removing all elements of List2
            System.out.println("After removing elements of list2: ");
            System.out.println(list);                                   //Print the list
            
         /*Elements can be removed specifically from the beginning or end of the LinkedList, using:
            1) removeFirst()
            2) removeLast()
        */
        
        list.removeFirst();                                             //Add element to the starting of list
        list.removeLast();                                              //Add element to the end of list
        System.out.println("FINAL LIST: ");        
        System.out.println(list);                                       //Print the final LinkedList
        
        

    }

}
