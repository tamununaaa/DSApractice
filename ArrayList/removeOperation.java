/*
In order to add an element to an ArrayList, we can use the add() method that is overloaded to perform 
multiple operations based on different parameters. They are:
    1) remove(Object): Remove specific element from the list
    2) remove(int index): Remove element at a specific index from the list
    3) removeAll(Object): Remove elements of another list from the list
    4) removeIf(): Removing elements on the basis of a specified condition
    5) clear(): Remove all the elements of list
*/
package ArrayList;
import java.util.*;
public class removeOperation {
    public static void main(String args[])
    {
        ArrayList<String> list1 = new ArrayList<>();                                  //List-1
        list1.add("Germany");                                                       
        list1.add("France");
        list1.add("Italy");
        list1.add("Mexico");
        list1.add("Turkey");
        list1.add("Ukraine");
        
        ArrayList<String> list2 = new ArrayList<>();                                  //List-2
        list2.add("Ron");                                                           
        list2.add("Caroline");
        list2.add("Meghan");
        list2.add("Jeremy");
        
        //Combining both lists
        list1.addAll(list2);
        System.out.println("Print list of elements (combined): " + list1);
        System.out.println();
        
        //Remove a specific element
        list1.remove("Ron");    
        System.out.println("Print list after removing 'Ron': " + list1);
        System.out.println();
        
        //Remove element at a specific index
        list1.remove(2);
        System.out.println("Print list after removing element at index '2': " + list1);
        System.out.println();
        
        //Remove all elements of list-2 from list-1
        list1.removeAll(list2);
        System.out.println("Print list after removing elements of list-2: " + list1);
        System.out.println();

        //Remove elements of list on the basis of a specific condition
        list1.removeIf(str->str.contains("Mexico"));
        System.out.println("Print list after removing elements off a certain condition: " + list1);
        System.out.println();
        
        //Remove all the elements from the list, i.e. clear the list
        list1.clear();
        System.out.println("Print list after removing all the elements from the list: " + list1);


    }
    
}
