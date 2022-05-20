package LinkedList.LinkedListTypes;

public class DoublyLinkedList {
    class Node                                                  //Represents node of the doubly linked list
    {
        int data;
        Node previous;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }

    }

    Node head, tail = null;                                     //Head and Tail of the Doubly LinkedList

    public void addNode(int data)                               //Add node to the Doubly Linked List
    {
        Node newNode = new Node(data);                          //Create a new node
        if(head == null)                                        //Check if list is empty
        {
            head = tail = newNode;                              //Head and tail point to new node
            head.previous = null;                               //Head's previous will point to null
            tail.next = null;                                   //Tail's next will point to null (as it is last node)
        }
        else                                                    //List is not empty, so it will be added after tail
        {
            tail.next = newNode;                                //Tail's next will point to new node
            newNode.previous = tail;                            //New node's previous will point to tail
            tail = newNode;                                     //New node will become new tail
            tail.next = null;                                   //Tail's next will point to null (as it is last node)
        }
    }

    public void display()                                       //Method to display nodes of the Doubly Linked List
    {
        Node current = head;                                    //Node current will point to head
        if(head==null)                                          //If head is null, i.e., list is empty
        {
            System.out.println("List is empty!");            //Print message
            return;
        }
        System.out.println("Nodes: ");                       //Else, list contains nodes
        while(current!=null)
        {
            System.out.println(current.data + " ");            //Print each node 
            current = current.next;                            //By incrementing the 'current' pointer
        }
    }

    public static void main(String args[])
    {
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.addNode(100);
        dlist.addNode(200);
        dlist.addNode(300);
        dlist.addNode(400);

        dlist.display();
    }
    
}
