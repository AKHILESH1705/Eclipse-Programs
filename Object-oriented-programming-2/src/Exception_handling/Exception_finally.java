package Exception_handling;

public class Exception_finally {
		public static int fact(int n) throws NegativeNumberException
		{
			if(n<0) {
				throw new NegativeNumberException();
			}
			return n*n;
		}
		public static int divide(int a,int b) throws DivideByZeroException{
			if(b<0) {
				throw new DivideByZeroException();
			}
			return a/b;
		}
	    public static void main(String[] args){
	    try{                  // try block should be followed by either catch or finally block
	    	divide(5,1);
	       System.out.println(fact(-1));
	    }
	    catch(DivideByZeroException e){
	        System.out.print("Exception caught ");
	    }
	    catch(NegativeNumberException e){
	        System.out.print("Arithmetic Exception caught ");
	   }
	   finally{
	       System.out.print("finally block");
	   } 
	 }
	}
