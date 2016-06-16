package com.interview.testq;

import java.util.LinkedList;

/*
You are given a linked list & two integer numbers m & n. Retain m elements, delete n elements. Repeat till end of list

*/

public class LinkedListManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		ll.add(10);
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.add(16);
		ll.add(17);
		ll.add(18);
		ll.add(19);
		ll.add(20);
		
		int m=2;
		int n=3;
		
		System.out.println(ll.size());
		System.out.println("printing ll - " + ll);
		
		LinkedList l2 = new LinkedList<>();
		int count=0;
		while(count<ll.size()){
			int limit=count+m;
			while(count<limit){
				//System.out.println(ll.get(count));
				//System.out.println("Adding ---- " + count);
				l2.add(ll.get(count));
				count++;
				if(count>=ll.size())
					break;
			}
			limit=count+n;
			while(count<limit){
				count++;
				if(count>=ll.size())
					break;
			}
		}
		
		System.out.println("l2 is - " + l2);
		
	}

}
