/*
In order to add an element to an LinkedList, we can use the add() method that is overloaded to perform 
multiple operations based on different parameters. They are:  
    1) add(Object): Add elements at the end of the list
    2) add(int index, Object): Add elements at a specified index
    3) addAll(Oject): Add elements of another list at the end of one list
    4) addAll(int index, Object): Add elements of another list at the specified index of one list
    5) addFirst(): Add element to the beginning of the list
    6) addLast(): Add element at the end of the list
*/

package LinkedList.LinkedListOperations;
import java.util.*;
class LinkedListOperations{

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();          //Create a linked list 

        //1) add(Object)
        list.add("Germany");                                      
        list.add("Ireland");
        list.add("France");
        list.add("Ukraine");

        System.out.println(list);                            

        //2) add(int index, Object)
        list.add(1,"Luxembourg");                
        list.add(3,"New Zealand");   

        System.out.println(list);                                    
        
        //3) addAll(Object)
        LinkedList<String> list2 = new LinkedList<String>();         //Creating another list
        list2.add("Raymond");                                    
        list2.add("Philip");
        
        list.addAll(list2);
        System.out.println(list2); 

        //4) addAll(int index, Object)
        list2.add("Caroline");                                    
        list2.add("Barbar");
        
        list.addAll(3, list2);
        System.out.println(list); 

        //5) addFirst(Object)
        list.addFirst("firstElement");
        System.out.println(list); 

        //6) addLast(Object)
        list.addLast("lastElement");
        System.out.println(list); 

    }
}