package Hashing;

import java.util.*;
public class hashSet {
    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<>();              //Create HashSet called set
        set.add("Magenta");                                 //Add elements to the set
        set.add("Purple");
        set.add("Black");
        set.add("Yellow");

        System.out.print("Original Set: " + set);           //Print the set
        System.out.println();
            
        //HashSet does not allow duplicate elements
        set.add("Brown");                                   //Add new element
        set.add("Purple");                                  //Add duplicate element
     
   
        System.out.print("New Set: " + set);                 //Print the set
        System.out.println();
        
        
        HashSet<String> set2 = new HashSet<>();              //Create another hashset
        set2.add("Winter");                                  //Add elements to set2
        set2.add("Monsoon");
        set2.add("Spring");

        System.out.print("Set 2 elements: " + set2);         //Print elements of set2
        System.out.println();
        
        //Combine set2 to set
        set.addAll(set2);                                    //Append all elements of set2 to set
        System.out.print("Combined Set: " + set);            //Print the new set
        System.out.println();
        
        //Remove elements from set
        set.remove("Brown");                                 //Remove a particular element from set
        
        set.removeAll(set2);                                 //Remove all elements of set2 from set

        System.out.print("New Set: " + set);                 //Print the new set
        System.out.println();
        
        set.clear();                                         //Remove all elements from set                    
        System.out.print("New Set: " + set);                 //Print the new set
        System.out.println();       
                
    }
    
}
