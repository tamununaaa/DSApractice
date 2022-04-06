package Hashing;

import java.util.HashMap;

public class hashMap {
    
    public static void main(String args[])
    {
        HashMap<Integer,String> map = new HashMap<Integer,String>();           //Create a HashMap called map
        map.put(1,"Pink");                                                     //Add elements to map
        map.put(2,"Orange");
        map.put(3,"Brown");
        map.put(5,"Purple");

        System.out.print("Hashmap: " + map);                                   //Print elements of map
        System.out.println();
        
        System.out.print("Hashmap: ");                                         //Print elements of map by iteration
        for(HashMap.Entry m:map.entrySet())                                    //Iterate over the map
        System.out.print(m.getKey() + ":" + m.getValue() + " ");               //Print map values (key and values)
        System.out.println();
        

        /*  Check if a value is present at the specified key. 
                If specified index doesn't exist in map, create new index and put the value assigned
                Otherwise, irrespective of the value given, don't make changes to value */
        
        map.putIfAbsent(3, "Red");                                             
            //Checks if 'Red' exists at index 3, if not, doesn't change the value

        map.putIfAbsent(4, "Red");                                             
            //Checks if 'Red' exists at index 4, if not, create new key and value

        System.out.print("Hashmap: " + map);                                   //Print elements of map
        System.out.println();
        
        //Duplicate elements in map
        map.put(3, "Green");                                                   //Element at index 3 already exists
        System.out.print("Map on adding duplicate elements: " + map);          //Print elements of map
        System.out.println();
                
        HashMap<Integer,String> map2 = new HashMap<Integer,String>();
        map2.put(1,"Melon");
        map2.put(2,"Strawberry");
        map2.put(3,"Apple");
        
        map.putAll(map2);                                                       //Append elements of map2 to map
        System.out.print("Combined Hashmap: " + map);                           //Print elements of map
        System.out.println();   
        
        map.remove(4);                                                                              
        System.out.print("New Hashmap: " + map);                                //Print elements of map
        System.out.println();   
        
        /*
        Replace items in a list:
        1. replace(int key, String oldValue, String newValue) - give key, oldValue, newValue as parameters
        2. replace(int key, String value) - give key, new value
        3. replaceAll((k,v)-> String value) - replace all values in the map
        */
        map.replace(1, "Melon", "Watermelon");
        map.replace(2, "Berry");
        System.out.print("New Hashmap after replacing elements: " + map);       //Print elements of map
        System.out.println();   
        
        map.replaceAll((k,v)->"Banana");                                        
        System.out.print("New Hashmap with replaced elements: " + map);         //Print elements of map
        System.out.println();   
       
    }

}
