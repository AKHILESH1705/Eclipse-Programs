package Test_constructor;

import java.util.*;

public class Polynomial_use {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0 ; i<n;i++) {
			degree1[i]  = s.nextInt();
		}
		int coffi1[] = new int[n];
		for(int i = 0 ; i<n;i++) {
			coffi1[i]  = s.nextInt();
		}
		Polynomial first = new Polynomial();
        for(int i = 0 ; i < n; i++) 
        {		
		first.set_coff(degree1[i], coffi1[i]);
       	}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0 ; i<n;i++) {
			degree2[i]  = s.nextInt();
		}
		int coffi2[] = new int[n];
		for(int i = 0 ; i<n;i++) {
			coffi2[i]  = s.nextInt();
		}
		
		
        Polynomial second = new Polynomial();
        for(int i = 0 ; i < n; i++) 
        {		
		second.set_coff(degree2[i], coffi2[i]);
       	}
        
        //first.print();
        //second.print();
        //first.add(second);
      //  first.print();
        first.substract(second);
        first.print();
	}
	
}
