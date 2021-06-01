package arrays2d;

import java.util.*;
public class LargestColumnSum {

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
	
	public static int LargestSum(int[][]arr) {
	
		int row = arr.length;
		int col = arr[0].length;
		int max = Integer.MIN_VALUE;
		//int colm = 0;
		for(int j = 0;j<col;j++) 
		{
			int sum = 0;
			
			for(int i = 0;i<row;i++) 
			{
				sum = sum + arr[i][j];
				
			}
				if( sum > max) 
				{
					//colm = j;
					max = sum;
				}
			
		}
		return max; //colm;
	}
	
	public static void printArray(int[][]arr) {
		int row = arr.length;
		int col = arr[0].length;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[][] = takeInput();
		printArray(arr);
		int sum = LargestSum(arr);
		System.out.println(sum);//colm
		
	}
	
}
