package com.test;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		System.out.println(matrix.length);
		for(int i = 0; i< matrix.length; i++){
			for(int j=0; j<matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
		matrix = rotateMatrix(matrix);
		//matrix = rotateMatrix(matrix);
		//matrix = rotateMatrix(matrix);
		System.out.println("Rotated matrix");
		for(int i = 0; i< matrix.length; i++){
			for(int j=0; j<matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
		int x  = 1;
		matrix=addIntToMatrix(matrix, x);
		System.out.println("Added matrix");
		for(int i = 0; i< matrix.length; i++){
			for(int j=0; j<matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
		
		

	}
	
	private static int[][] rotateMatrix(int[][] matrix){
		int[][] rotatedMatrix = new int[matrix.length][matrix.length];
		int length = matrix.length;
		for(int i=0; i<length; ++i){
			for(int j=0; j< length; ++j){
				//rotatedMatrix[i][j]=matrix[length-j-1][i];
				rotatedMatrix[length-j-1][i]=matrix[i][j];
			}
		}
		return rotatedMatrix;
	}
	
	private static int[][] addIntToMatrix(int[][] matrix, int num){
		//int[][] addedMatrix = new int[matrix.length][matrix.length];
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix.length; j++){
				if(j==0)
					continue;
				matrix[i][j]=matrix[i][j]+num;
			}
		}
		
		return matrix;
	}

}
