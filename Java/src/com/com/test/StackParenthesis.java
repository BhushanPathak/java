package com.test;

import java.util.HashMap;
import java.util.Stack;

public class StackParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isBalanced=true;
		HashMap<Character, Character> parenthesis = new HashMap<>();
		parenthesis.put('{', '}');
		parenthesis.put('[', ']');
		parenthesis.put('(', ')');
		parenthesis.put('<', '>');
		String input="]({()})";
		Stack<Character> stack= new Stack<>();
		char[] array=input.toCharArray();
		for(int i=0; i<array.length; i++){
			
			if(parenthesis.containsKey(array[i])){
				stack.push(array[i]);
			} else if(!stack.empty() && parenthesis.get(stack.peek())==array[i]){
				stack.pop();
			} else {
				isBalanced=false;
				break;
			}
		}
		if(!stack.empty())
			isBalanced=false;
		
		System.out.println(isBalanced);
	}

}
