package com.delete.duplicate.nodess;

/*You're given the pointer to the head node of a sorted linked list, where the data in the nodes is in ascending order. 
 * Delete as few nodes as possible so that the list does not contain any value more than once. 
 * The given head pointer may be null indicating that the list is empty.
*/
public class DeleteDuplicateNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(1);
		head.next.next = new Node(3);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		Node n = head;
		while (n!=null){
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.println("\n--------");
		n = RemoveDuplicates(head);
		while (n!=null){
			System.out.print(n.data + "->");
			n = n.next;
		}
	}
	
	static Node RemoveDuplicates(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method. 
		if ( head == null ) 
			return null;
		Node nextItem = head.next;
		while ( nextItem != null && head.data == nextItem.data ) {
		    nextItem = nextItem.next;
		  }
		  head.next = RemoveDuplicates( nextItem );
		  return head;

		}

}

class Node {
    int data;
    Node next;
    
    public Node(int data) {
		this.data = data;
		this.next = null;
	}
    
 }
