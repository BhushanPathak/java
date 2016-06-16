package com.interview.testq;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*How to find non- common elements between two string arrays. Eg: String a[]={"a","b","c","d"}; 
String b[]={"b","c"}; 
O/p should be a,d*/

public class NonCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]={"a","b","c","d"}; 
		String b[]={"b","c"};
		usingIteration(a, b);
		System.out.println("");
		usingLinkedList(a, b);
	}
	
	private static void usingIteration(String[] a, String[] b){
		int l1=a.length;
		int l2=b.length;
		boolean match=false;
		for(int i=0; i<l1;i++){
			match=false;
			for(int j=0; j<l2;j++){
				if(a[i].equalsIgnoreCase(b[j]))
					match=true;
			}
			if(!match)
				System.out.print(a[i] + " ");
		}
		
		for(int i=0; i<l2;i++){
			match=false;
			for(int j=0; j<l1;j++){
				if(b[i].equalsIgnoreCase(a[j]))
					match=true;
			}
			if(!match)
				System.out.print(b[i] + " ");
		}
	}
	
	private static void usingLinkedList(String[] a, String[] b){
		LinkedList<String> l1=new LinkedList<String>(Arrays.asList(a));
		LinkedList<String> l2=new LinkedList<String>(Arrays.asList(b));
		
		for(String str : l1){
			if(!l2.contains(str)){
				System.out.print(str + " ");
			}
		}
		
		for(String str : l2){
			if(!l1.contains(str)){
				System.out.print(str + " ");
			}
		}
	}

}
