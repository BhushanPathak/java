package com.test;

import java.util.Scanner;

public class PrintStairCase {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        printStair(n);
	    }
	    
	    private static void printStair(int num){
	        for(int j=0;j<num;j++){
	            for(int i=1;i<=num;i++){
	                System.out.print(i<num-j?" ":"#");
	            }
	            System.out.println("");
	        }
	        
	    }
}
