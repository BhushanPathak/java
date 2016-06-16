package com.test;

public class IntToBinary {
	
	public static void main(String[] args) {
		int i= 25;
		
		System.out.println(Integer.toBinaryString(i));
		int sum = 10;
		
		int[] array= {1,2,4,3,5,6};
		
		findPairs(sum, array);

	}
	
	private static void findPairs(int sum, int[] list){
		int[] combination;
		for (int i =0 ; i<list.length; i++){
			int total=0;
			int j=0;
			combination = new int[list.length];
			total+=list[i];
			
			if(total>sum)
				continue;
			
			combination[j] = list[i];
			
			
			for(int k=i+1; k<list.length; k++){
				total+=list[k];
				if(total==sum){
					j++;
					combination[j]=list[k];
					for (int o = 0; o < list.length; o++) {
					    System.out.print(list[o] + " ");
					  }
					System.out.println("");
					continue;
					
					
				}
			}
		}
	}
	
}
