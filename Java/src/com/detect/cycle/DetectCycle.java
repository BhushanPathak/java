package com.detect.cycle;

/*
Detect cycle in the list
head pointer input could be NULL as well for empty list
Node is defined as 
class Node {
   int data;
   Node next;
}
*/

public class DetectCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1=new Node(1);
		Node head2=new Node(1);
		head2.next = new Node(3);
		head2.next.next  = head2.next;
		System.out.println(HasCycle(head1));
		System.out.println(HasCycle(head2));

	}
	
	static int HasCycle(Node head) {
		if (head == null) {
		    return 0;
		}

		Node hare = head;
		Node tortoise = head;
		while (hare != null) {
		    hare = hare.next;
		    if (hare == null) {
		        return 0;
		    }
		    hare = hare.next;
		    if (hare==tortoise) {
		        return 1;
		    } else {
		        tortoise = tortoise.next; 
		    }
		}
		return 0;
		/*int hasCycle=0;
		
		if(head==null)
			return hasCycle;
		
		Node s = head;
		Node f = head;
		
		while(f!=null){
			if(s.next!=null && f.next.next!=null){
				s=head.next;
				f=head.next.next;
				if(s.data==f.data){
					hasCycle=1;
					break;
				}
			}	
		}
		
		return hasCycle;
*/
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
