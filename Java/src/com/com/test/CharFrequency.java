package com.test;

import java.util.HashMap;
import java.util.HashSet;

public class CharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "aaannnsaads";
		/*HashMap<Character, Integer> map = new HashMap<>();
		
		for(Character c : s.toCharArray()){
			if(map.containsKey(c)){
				int count = (int) map.get(c);
				map.replace(c, count++);
			}else{
				map.put(c, 1);
			}
		}
		
		for(Character c : map.keySet()){
			System.out.println(c + " " + map.get(c));
		}*/
		
		char[] array=s.toCharArray();

		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<array.length-1;i++){
		if(!map.containsKey(array[i])){
		map.put(array[i], 1);
		}
		else 
		map.put(array[i],map.get(array[i])+1);
		}

		for(Character a : map.keySet()){
		System.out.println(a +" && "+ map.get(a));
		}	
	}

	
}
