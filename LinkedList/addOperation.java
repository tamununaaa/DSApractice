package LinkedList;

import java.util.*;
class LinkedListOperations{

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();     //Create a linked list called 'list' of String type

        list.add("Germany");                                    //using add() function to add elements at the end of the list
        list.add("Ireland");
        list.add("France");
        list.add("Ukraine");

        System.out.print(list);                                 //Print the list

    }

    
}