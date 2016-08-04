package com.interview.testq;

import java.util.Arrays;
import java.util.List;

public class IdentifyFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> inputList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int inputNumber = 12;
		findNumberPair(inputList, inputNumber);
		

	}

	private static void findNumberPair(List<Integer> inputList, int inputNumber) {
		// TODO Auto-generated method stub
		boolean pairExists=false;
		for (int i=0; i<inputList.size(); i++){
			if(inputList.get(i)>= inputNumber){
				continue;
			}else{
				if(inputList.contains(inputNumber - inputList.get(i))){
					System.out.println(inputList.get(i) + " & " + (inputNumber - inputList.get(i)));
					pairExists=true;
					break;
				}
			}
			
			
		}
		if(!pairExists)
			System.out.println("Pair does not exist");
	}

}
