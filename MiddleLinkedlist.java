class Node
{
    int data;
    Node next;
}

public class MiddleLinkedlist {
    static Node previous = null;
    static Node current = null;
    static Node first = null;

    public static void insert(int data ){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        if( previous != null && current != null )
   	 {
   	      previous.next = temp;
   	      temp.next = current;
   	      return;
   	 }
    }

    public static void display()
    {
   	 Node traverse = first;
   	 while ( traverse != null )
   	 {
   		 System.out.println( traverse.data );
   		 traverse = traverse.next;
   	 }
    
    }

    public static void main(String[] args){
        MiddleLinkedlist.insert(1);
        MiddleLinkedlist.insert(2);
        MiddleLinkedlist.display();
    }
}
