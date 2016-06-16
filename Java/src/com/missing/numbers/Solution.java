package com.missing.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.sound.midi.MidiSystem;

/*Numeros, the Artist, had two lists  and , such that  was a permutation of . Numeros was very proud of these lists. Unfortunately, while transporting them from one exhibition to another, some numbers were left out of . Can you find the missing numbers?

Notes

If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number.
You have to print all the missing numbers in ascending order.
Print each missing number once, even if it is missing multiple times.
The difference between maximum and minimum number in  is less than or equal to .
Input Format 
There will be four lines of input:

 - the size of the first list 
This is followed by  space-separated integers that make up the first list. 
 - the size of the second list 
This is followed by  space-separated integers that make up the second list.

Output Format 
Output the missing numbers in ascending order.
*/


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map a  = scanList(n, sc);
        
        System.out.println(a);
	}
	
	private static Map scanList(int noOfElements, Scanner sc){
		Map m = new HashMap();
		for(int i=0; i<noOfElements; i++){
        	int key = sc.nextInt();
        	if(m.containsKey(key)){
        		m.put(key, (int)m.get(key)+1);
        	}else{
        		m.put(key, 1);
        	}
        }
		return m;
	}
	
	private static void findMissingNumbers(Map a, Map b){
		List<Integer> missingNumbers =  new ArrayList<Integer>();
		Set<Integer> s = a.keySet();
		for(int i : s){
			if(b.containsKey(i)){
				if(a.get(i)!=b.get(i)){
					missingNumbers.add(i);
				}
			}
		}
		if(missingNumbers.size()>0){
			Collections.sort(missingNumbers);
				for(int i=0; i<missingNumbers.size(); i++){
					System.out.print(missingNumbers.get(i) + " ");
				}
		}
		
	}

}
