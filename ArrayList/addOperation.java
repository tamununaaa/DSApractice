/*
In order to add an element to an ArrayList, we can use the following methods:
    1) add(Object): Add elements to the end of the list
    2) add(int index, Object): Add elements at a specific index of the list
    3) addAll(Object): Add elements of another list at the end of the list
    4) addAll(int index, Object): Add elements of another list at a specific index of the list
*/
package ArrayList;
import java.util.*;
public class addOperation {
    public static void main(String args[])
    {
        ArrayList<String> list1 = new ArrayList<>();                                  //List-1
        list1.add("Germany");                                                       //Add elements at the end of the list
        list1.add("France");
        list1.add("Italy");
        list1.add("Mexico");
        System.out.println("Print list of first elements: " + list1);
        System.out.println();
        
        list1.add(1,"Turkey");                                         //Add elements at specified index of the list
        list1.add(3,"Spain");
        System.out.println("On adding elements at specified positions: " + list1);
        System.out.println();

        ArrayList<String> list2 = new ArrayList<>();                                  //List-2
        list2.add("Ron");                                                           //Add elements at the end of the list
        list2.add("Caroline");
        list2.add("Meghan");
        list2.add("Jeremy");
        System.out.println("Print list of second elements: " + list2);
        System.out.println();

        //Add elements of list-2 at the end of list-1
        list1.addAll(list2);        
        System.out.println("Combined list " + list1);
        System.out.println();
        
        //Add elements of list-1 at the end of list-2 at a specified index
        list2.addAll(3, list1);        
        System.out.println("Combined list " + list2);
        System.out.println();

    }
    
}
