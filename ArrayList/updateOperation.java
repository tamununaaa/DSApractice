//The get() method returns the element at the specified index, whereas the set() method changes the element.
package ArrayList;
import java.util.*;
public class updateOperation {
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jeremy");
        list.add("Justin");
        list.add("Noah");
        list.add("Robert");
        list.add("Hannah");
        list.add("Jack");
        list.add("Carl");
        
        System.out.println("Print the list: " + list);

        //Using get() method to return element at specified index
        System.out.println("Print element at index 3: " + list.get(3));
        
        //Using set() method to update value of element at specified index
        list.set(3,"Chris");
        System.out.println("Print updated list: " + list);

    }
}
