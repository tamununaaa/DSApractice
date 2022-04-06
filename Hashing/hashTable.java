package Hashing;

import java.util.Hashtable;
import java.util.*;

public class hashTable {
    public static void main(String args[])
    {
        Hashtable<Integer,String> table = new Hashtable<Integer,String>();          //Create a HashTable called table
        table.put(1,"Monsoon");                                                     //Add elements to table
        table.put(2,"Spring");
        table.put(3,"Summer");
        table.put(4, "Autumn");

        System.out.println("Hashtable: " + table);                                    //Print elements of HashTable
        
        System.out.print("Hashtable: ");
        for(Map.Entry m:table.entrySet())                                           //Iterate over elements of HashTable
            System.out.print(m.getKey()+ ":" + m.getValue() + " ");                 //Print key and value
        System.out.println();
        
        
        //getOrDefault() method retrieves data at specified key location or else displays the default method
        System.out.println(table.getOrDefault(4, "Element not found!"));            //Get value at index 4 or print default message
        System.out.println(table.getOrDefault(5, "Element not found!"));            //Get value at index 5 or print default message 
        
        /*  Check if a value is present at the specified key. 
                If specified index doesn't exist in map, create new index and put the value assigned
                Otherwise, irrespective of the value given, don't make changes to value */

        table.putIfAbsent(4,"Winter");                                              //If value at key 4 is Winter, return Winter, else return original value
        System.out.println("On addding Winter at key 4: " + table);

        table.putIfAbsent(5,"Winter");                                              //If value at key 5 is Winter, return Winter, else create new key and value
        System.out.println("On adding Winter at key 5: " + table);

        //remove elements from table
        table.remove(3);                                                            //Remove value at key 3
        System.out.println("On removing value at index 3: " + table);  

        //update a key in table
        table.put(3,"Hot");
        System.out.println("Updated table: " + table);
    
        //retrieve value from HashTable
        System.out.println("Get value at key 2 from table: " + table.get(2));

    }
}
    
