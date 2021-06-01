package Exception_handling;

public class Exception_test {
			    static int divideByZero(int a, int b){ 
		        int i = a/b;  
		        return i; 
		    } 
		    static int computeDivision(int a, int b) { 
		        int res =0; 
		        try
		        { 
		          res = divideByZero(a,b); 
		        } 
		        catch(NumberFormatException ex) 
		        { 
		           System.out.println("Exception occured");  
		        } 
		        return res; 
		    } 
		    public static void main(String args[]){ 
		        int a = 1; 
		        int b = 0; 
		        int i=0;  
		        try
		        { 
		             i = computeDivision(a,b); 

		        } 
		        catch(ArithmeticException ex) 
		        { 
		            System.out.println("nhi hoga"); 
		        }
		        System.out.print(i);
		    }
} 

