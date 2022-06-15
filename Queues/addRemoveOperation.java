/* 
 The add(object) method is used to add elements to the REAR of the queue.
 The remove() method removes the element at the FRONT of the queue.
*/
package Queues;
import java.util.*;

public class addRemoveOperation {
    public static void main(String args[])
    {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);
        
        System.out.println("Original queue: " + queue);
        
        queue.remove();
        System.out.println("After removing element from front of queue: " + queue);




        


    }
    
}
