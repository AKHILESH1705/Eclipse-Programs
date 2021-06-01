package arrays2d;

import java.util.Scanner;

public class BoundaryWiseSum {	
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
	
	
	public static void sumofBoundary(int mat[][]){
	      	
        int N = mat.length;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i<mat.length;i++) {
			
			for(int j = 0; j<mat[0].length;j++) 
			{
				   if (i == j || (i + j) == N - 1) {
		                sum += mat[i][j];
		            }
		            else if (i == 0 || j == 0
		                     || i == N - 1
		                     || j == N - 1) {
		                sum += mat[i][j];
		            }
		     }
	 }
		System.out.println(sum);
	}
	public static void main(String[] args) {
	Scanner s  = new Scanner(System.in);
	
		   int t = s.nextInt();
	        while(t > 0) {
	            int[][] mat = take2DInput();
	            sumofBoundary(mat);
	            System.out.println();
	            t -= 1;
	        }
	}

}
