package com.get.node.value;

import java.util.Collections;
import java.util.LinkedList;

/*
Get Nth element from the end in a linked list of integers
Number of elements in the list will always be greater than N.
Node is defined as 
class Node {
   int data;
   Node next;
}
*/

public class GetNodeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(5);
		head.next = new Node(77);
		head.next.next = new Node(2);
		head.next.next.next = new Node(43);
		GetNode(head, 3);
	}
	
	static int GetNode(Node head,int n) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method. 
		int i=0;
		LinkedList<Node> l = new LinkedList<Node>();
		Node dummy = head;
		l.add(dummy);
		while(dummy.next!=null){
			l.add(dummy.next);
			dummy=dummy.next;
		}
		System.out.println(l.size() + " " + n);
		
		System.out.println(l.get(l.size()-1-n).data);
		
		return i;
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

