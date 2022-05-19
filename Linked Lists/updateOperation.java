/*
After adding the elements to the linked list, if we wish to change/update any element, it can be done using the 
set() method which is referenced by the index of the element and the required changes/updation.
*/

package LinkedList.LinkedListOperations;
import java.util.*;
public class updateOperation {
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

        list.set(1, "Russia");                                          //Update/change value of element at index 1
        list.set(3, "Bahamas");                                         //Update/change value of element at index 3

        System.out.println("UPDATED LINKED LIST: ");
        System.out.println(list);                                       //Print the list

    }
    
    
}
