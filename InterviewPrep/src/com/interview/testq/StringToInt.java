package com.interview.testq;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=-123;
		String out="";
		boolean negative=false;
		if(i<0)
			negative=true;
		
		i=Math.abs(i);
		while(i>0){
			out=i%10 + out;
			System.out.println("inside while loop -- " + out);
			i=i/10;
		}
		if(negative)
			out="-" + out;
		
		System.out.println("Final - " + out);
	}

}
