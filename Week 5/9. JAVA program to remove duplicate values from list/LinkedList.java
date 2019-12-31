
public class LinkedList {
	
	
	static Node head;
	
	public static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	
	public static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ===> ");
			node= node.next;
		}
		System.out.print(node);
		System.out.println("\n");
	}
	
    public static void deleteDuplicates() {
    	Node first = null, temp = null, duplicates = null; 
        first = head; 

        while (first != null && first.next != null) { 
        	// taking reference node to compare other
        	temp = first; 
        	
            while (temp.next != null) { 
  
                //compare if other node matches the reference node
                if (first.data == temp.next.data) {
                	duplicates = temp.next; 
                    temp.next = temp.next.next; 
                } 
                else { 
                	temp = temp.next; 
                } 
            } 
            first = first.next; 
        } 
    }

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.head = new Node(5);
		linkedlist.head.next = new Node(3);
		linkedlist.head.next.next = new Node(3);
		linkedlist.head.next.next.next = new Node(2);
		linkedlist.head.next.next.next.next = new Node(5);
		linkedlist.head.next.next.next.next.next = new Node(70);
		linkedlist.head.next.next.next.next.next.next = new Node(50);
		linkedlist.head.next.next.next.next.next.next.next = new Node(70);
		
		System.out.println("Linked list with duplicate Nodes in linked list are: \n");
		printList(head);
		deleteDuplicates();
		System.out.println("Linked list with no duplicate nodes are: \n");
		printList(head);
	}

}
