package com.missing.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class AlternatefromWeb {
	/**
	 * Function which creates a an integer array from string consisting of
	 * integers separated by spaces. Throws a {@link IllegalArgumentException}
	 * if the number of integers present in the string is not equal to the size
	 * expected
	 * 
	 * @param elements
	 *            : String containing integers separated by a space
	 * @param size
	 *            : the expected number of integers in the string supplied
	 * @return : an int array which contains size number of intergers
	 */
	private static int[] getElements(String elements, int size) {

		String[] elementsArray = elements.trim().split(" ");

		if (elementsArray.length != size)
			throw new IllegalArgumentException("Number of elements in the list does not match the size provided");

		int[] numbers = new int[size];
		int index = 0;

		// extract integers
		for (String ele : elementsArray) {
			numbers[index++] = Integer.parseInt(ele);
		}
		return numbers;
	}

	/**
	 * Function to find list2 - list1
	 * 
	 * @param list1
	 *            : the first list of numbers
	 * @param list2
	 *            : the second list of numbers (the bigger list)
	 * @return : a {@link PriorityQueue} which list2 - list1 in sorted manner
	 */
	private static PriorityQueue<Integer> findMissingNumbers(int[] list1, int[] list2) {
		Hashtable<Integer, Integer> freqCounter = new Hashtable<Integer, Integer>();

		// process B
		for (int ele : list2) {
			if (freqCounter.containsKey(ele)) {
				freqCounter.put(ele, (freqCounter.get(ele)) + 1); // increment
																	// the
																	// Occurrence
			} else {
				freqCounter.put(ele, 1); // first occurrence
			}
		}

		// process A
		for (int ele : list1) {
			if (freqCounter.containsKey(ele)) {
				freqCounter.put(ele, (freqCounter.get(ele)) - 1); // decrement
																	// the value
			} else {
				// we found a number which was not in List2 and is in List1
				// this should not happen so report it
				throw new NoSuchElementException("Found a number in B which is not in A");
			}
		}

		// now every number which has positive occurrence gives B - A
		// create a priority with keys which has positive occurrence
		PriorityQueue<Integer> result = new PriorityQueue<Integer>();
		for (Map.Entry<Integer, Integer> entry : freqCounter.entrySet()) {
			if (entry.getValue() > 0) {
				result.offer(entry.getKey());
			}
		}
		return result;
	}

	public static void main(String[] args) {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			int list1Size = Integer.parseInt(input.readLine());
			int[] list1 = getElements(input.readLine(), list1Size);
			int list2Size = Integer.parseInt(input.readLine());
			int[] list2 = getElements(input.readLine(), list2Size);

			PriorityQueue<Integer> result = findMissingNumbers(list1, list2);
			int resultSize = result.size();
			for (int i = 0; i < resultSize; i++) {
				System.out.print(result.remove());
				if (i < resultSize - 1)
					System.out.print(" ");
			}
			input.close();

		} catch (IOException e) {
			System.err.println("Caught IOException: Error while reading input from stdin");
			e.printStackTrace();
		}
	}
}
