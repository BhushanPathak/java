package com.test;

public class PermList {
	
	static boolean nextPerm(int [] nums) 
	  {   int i =  nums.length - 2;
		  while(i >= 0) {
				if(nums[i] < nums[i + 1])
					break;
				i--;
		  }
		  if (i ==  -1) {
			  return false;
		  }
		  int j =  nums.length - 1;
		  while(j > i) {
				if(nums[j]>nums[i])
					break;
				j--;
		  }
		  if (j != i) {
			  swap(i,j,nums);
		  }
		  int k = i + 1;
		  int l = nums.length - 1;
		  while(k < l) {
			  swap(k,l,nums);
			  k++;
			  l--;
		  }
		  return true;
			 
	  }
	static void swap(int i, int j, int[] arr) {
			int temp = arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
	static void generatePermutation(int[] nums) {
		 while (nextPerm(nums)) {
			 for (int i : nums)
				 System.out.print(i);
			 System.out.println();
		 }
	  }
	
	public static void main(String[] args) {
		int[] s={1,2,3,5,3,5};
		generatePermutation(s);
	}

}
