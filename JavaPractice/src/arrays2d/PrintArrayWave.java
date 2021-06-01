package arrays2d;

import java.util.Scanner;

public class PrintArrayWave {
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
		
		
		public static void WavePattern(int mat[][]){
		      	
		    int row = mat.length;       
            if(row!=0){      
			for(int j = 0;j<mat[0].length;j++) {
					if(j%2==0) {
						for(int k = 0;k<row;k++) {
							System.out.print(mat[k][j]+" ");
						}
					}
					else {
						for(int k = row-1;k>=0;k--) {
							System.out.print(mat[k][j]+" ");
						}
					}
			}
        } 
		}
		public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
			   int t = s.nextInt();
		        while(t > 0) {
		            int[][] mat = take2DInput();
		            WavePattern(mat);
		            System.out.println();
		            t -= 1;
		        }
		}

	}
