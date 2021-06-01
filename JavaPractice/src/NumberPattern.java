import java.util.*;
import java.lang.*;
import java.io.*;
public class NumberPattern {	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    int i = 0;
	    while(i<num){
	        int j = 0,a=i+1;
	        while(j<=i){
	            System.out.print(a);
	            j++;
	            a--;
	        
	        }
	        i++;
	        System.out.println();
	    }
	}
}

/*
  
  1
  2 1
  3 2 1
  4 3 2 1
  5 4 3 2 1
  
  
 */

