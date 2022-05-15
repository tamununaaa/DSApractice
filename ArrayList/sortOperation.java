//ArrayList can be sorted using the Collections.sort() method.

package ArrayList;
import java.util.*;
public class sortOperation {
    public static void main(String args[])
    {
        ArrayList<String> list1 = new ArrayList<String>();          //List-1 of string type
        list1.add("Orange");
        list1.add("Blue");
        list1.add("Pink");
        list1.add("Yellow");
        list1.add("Green");
        list1.add("Purple");

        ArrayList<Integer> list2 = new ArrayList<Integer>();        //List-2 of integer type
        list2.add(300);
        list2.add(20);
        list2.add(100);
        list2.add(4);
        list2.add(0);

        //Printing both lists before and after sorting:

        System.out.println("ArrayLists before sorting: ");
        
        System.out.println("ArrayList-1");
        for(int i=0;i<list1.size();i++)
        System.out.print(list1.get(i) + " ");
        System.out.println();
        
        System.out.println("ArrayList-2");
        for(int i=0;i<list2.size();i++)
        System.out.print(list2.get(i) + " ");
          
        System.out.println("ArrayLists after sorting: ");
        
        System.out.println("ArrayList-1");
        Collections.sort(list1);                                    //function to sort elements of the list
        for(int i=0;i<list1.size();i++)
        System.out.print(list1.get(i) + " ");
        System.out.println();
        
        System.out.println("ArrayList-2");
        Collections.sort(list2);                                   //function to sort elements of the list
        for(int i=0;i<list2.size();i++)
        System.out.print(list2.get(i) + " ");
        System.out.println();

    }
    
}
