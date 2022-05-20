/*
In order to remove an element from a LinkedList, we can use the remove() method that is overloaded to perform 
multiple operations based on different parameters. They are: 
    1) remove(Object): Remove the specified element from the list
    2) remove(int index): Remove element at the specified index
    3) removeAll(Object): Remove all the elements of another list from a list
    4) removeFirst(): Remove the first element from a list
    5) removeLast(): Remove the last element from a list
    6) clear(): Remove all the elements from a list
*/
package LinkedList.LinkedListOperations;
import java.util.*;
public class removeOperation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();                  //Create a linked list 

        list.add("Germany");                                              
        list.add("Ireland");
        list.add("France");
        list.add("Ukraine");
        list.add("Luxembourg");                                 
        list.add("New Zealand");

        System.out.println("ORIGINAL LINKED LIST: ");
        System.out.println(list);                                            //Print the original list
        
        //1) remove(Object)
        list.remove("Ukraine");
        System.out.println("On removing Ukraine: " + list);                  //Print the list

        //2) remove(int index)
        list.remove(2);
        System.out.println("On removing element at index 2: " + list);       //Print the list

        //3) removeAll(Object)
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Blue");
        list2.add("Pink");
        list2.add("Purple");
        
        list.addAll(list2);                                                  //Combine elements of list2 and list
        System.out.println("New combined list" + list);                      //Print the combined list

        list.removeAll(list2);                                                  
        System.out.println("On removing elements of list 2: " + list);       //Print the list

        //4) removeFirst()
        list.removeFirst();
        System.out.println("On removing first element: " + list);            //Print the list

        //5) removeLast()
        list.removeLast();
        System.out.println("On removing last element: " + list);             //Print the list

        //6) clear()
        list.clear();
        System.out.println("On removing all elements: " + list);             //Print the list



        

    }

}