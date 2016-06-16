package com.sherlock.array;

/*Watson gives Sherlock an array A of length N.
 * Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left 
 * is equal to the sum of the elements on its right.
 * If there are no elements to the left/right,then the sum is considered to be zero.
 * Formally,find an element i,such that,A1+A2+...+Ai-1=Ai+1+....+Ai+2 N.  
 * Output Format 
	For each test case print YES if there exists an element in the array, 
	such that the sum of the elements on its left is equal to the sum of the elements on its right; 
	otherwise print NO.*/

public class SherlockArray {
	
	public static void main(String[] args){
		int[] a = new int[]{1,2,3,3};
		System.out.println(checkArray(a));
	}
	
	private static String checkArray(int[] a){
		
		if(a.length<=2){
			return "NO";
		}
		
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		
		int leftSum=a[0];
		sum-=a[0];
		sum-=a[1];
		//find the index
		for(int i=1;i<a.length;i++){
			if(leftSum==sum)
				return "YES";
			leftSum+=a[i];
			sum-=a[i+1];
		}
		
		return "NO";
	}
	
	
	
}
