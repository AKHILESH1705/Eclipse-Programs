package arrays2d;

import java.util.Scanner;

public class largest_Cols_and_Row_sum {
	
	public static int[][] take2DInput(){
		Scanner s = new Scanner(System.in);
		 int row = s.nextInt();
		 int col  = s.nextInt();
		 int arr[][] = new int[row][col];
		 for(int i = 0;i<row;i++) {
			 for(int j = 0;j<col;j++) {
				 //System.out.println("enter row"+" = "+i+"  and "+"  col"+" = "+j);
				 arr[i][j] = s.nextInt();
			 }
		 }
		return arr;
	}
	
	
	public static void findLargest(int mat[][]){
	      	

		int row_max = Integer.MIN_VALUE;
		int col_max = Integer.MIN_VALUE;
		int row = 0,col = 0,i;
		
		for(i = 0; i<mat.length;i++) {
			int sum = 0;
			for(int j = 0; j<mat[0].length;j++) 
			{
				sum = sum + mat[i][j];
			   }
				if(sum > row_max){
					row_max = sum;
					row = i;
					
				}
				
			}
		for(int j = 0; j<mat[0].length;j++) {
			int sum = 0;
			for(i = 0; i<mat.length;i++) 
			{
				sum = sum + mat[i][j];
			   }
				if(sum > col_max){
					col_max = sum;
					col = j;
					
				}
				
			}
		if(row_max>col_max) {
	        System.out.println("row " +row+" "+ row_max);	
	     }
		else {
	   		System.out.println("col " +col+" "+ col_max);	
		}
		}
		
	
	
	public static void main(String[] args) {
	Scanner s  = new Scanner(System.in);
	
		   int t = s.nextInt();
	        while(t > 0) {
	            int[][] mat = take2DInput();
	            findLargest(mat);
	            System.out.println();
	            t -= 1;
	        }
	}

}
