package arrays2d;

import java.util.*;

public class SpiralPattern {
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
			
			
			public static void Spiral(int mat[][]){
			    int row = mat.length;
				if(row!=0) {
				int top = 0;
				int down = row-1;
				int left = 0;
				int right = mat[0].length-1;
				int dir = 0;
				
				while(top<=down && left<=right) {
					if(dir==0) {
						for(int i = left; i<=right; i++) {
							System.out.print(mat[top][i]+" ");
						}
						top+=1;
					}
					else if(dir==1) {
						for(int i = top; i <=down; i++) {
							System.out.print(mat[i][right]+" ");
						}
						right-=1;
					}
					else if(dir==2) {
						for(int i = right; i>=left;i--) {
							System.out.print(mat[down][i]+" ");
						}
						down-=1;
					}
					else if(dir==3) {
						for(int i = down; i>=top;i--) {
							System.out.print(mat[i][left]+" ");
						}
						left+=1;
					}
					dir = (dir+1)%4;
				}
				
				
		}
}
			public static void main(String[] args) {
			Scanner s  = new Scanner(System.in);
			
				   int t = s.nextInt();
			        while(t > 0) {
			            int[][] mat = take2DInput();
			            Spiral(mat);
			            System.out.println();
			            t -= 1;
			        }
			}

		}
