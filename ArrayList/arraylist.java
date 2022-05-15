/*
The Java ArrayList implements the List interface. 
It is a dynamic list allowing flexibility in addition and deletion of elements.
*/

package ArrayList;
import java.util.ArrayList;

public class arraylist {
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();       //declaring an ArrayList of String type
        list.add("Horse");                                   //add elements to the ArrayList
        list.add("Leopard");
        list.add("Giraffe");
        list.add("Koala");
        list.add("Panda");

        System.out.println(list);                              //print elements of the ArrayList

    }    
}
