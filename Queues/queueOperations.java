package Queues;
import java.util.*;
public class queueOperations {
    
    public static void main(String args[])
    {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Catterpillar");
        queue.add("Moth");
        queue.add("Centipede");
        queue.add("Ladybug");

        //queue.poll() method retrieves and removes the element at the front of the queue
        System.out.println("Removing the first element of the queue: " + queue.poll());
        System.out.println("Queue after removing first element: " + queue);
        
        //queue.offer(object) method add element a the first position of the queue
        queue.offer("Butterfly");
        System.out.println("Queue after adding element at the first position: " + queue);
        
        //queue.peek() and queue.element() methods only retrieve the element at the front of the queue (do not remove the element)
        System.out.println("Element at the front of the queue: " + queue.peek());
        System.out.println("Element at the front of the queue: " + queue.element());


    }
}
