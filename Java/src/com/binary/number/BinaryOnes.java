package com.binary.number;

public class BinaryOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary = Integer.toBinaryString(5);
        int count=0;
        int max=0;
        for(int i=0; i<binary.length();i++){
        	if(binary.charAt(i)=='1'){
                count++;
                if(count>max)
                    max=count;
            }else{
                count=0;
            }
        }
        System.out.println(max);

	}

}
