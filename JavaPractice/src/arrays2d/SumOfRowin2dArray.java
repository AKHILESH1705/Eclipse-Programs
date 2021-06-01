package arrays2d;

import java.util.*;
public class SumOfRowin2dArray  
{
	public static int[][] takeInput(){
	     
		Scanner s = new Scanner(System.in);
		 int row = s.nextInt();
		 int col  = s.nextInt();
		 int arr[][] = new int[row][col];
		 for(int i = 0;i<row;i++) {
			 for(int j = 0;j<col;j++) {
				 System.out.println("enter row"+" = "+i+"  and "+"  col"+" = "+j);
				 arr[i][j] = s.nextInt();
			 }
		 }
		return arr;
	}
	
	public static void LargestSum(int[][]arr) {		
		for(int i = 0;i<arr.length;i++) 
		{
			int sum = 0;
			
			for(int j = 0;j<arr[i].length;j++) 
			{
				sum = sum + arr[i][j];	
			}
			System.out.print(sum+" ");
		}
	 }
	public static void main(String[] args) {
		int arr[][] = takeInput();
		LargestSum(arr);
		System.out.println();
		
	}
}
