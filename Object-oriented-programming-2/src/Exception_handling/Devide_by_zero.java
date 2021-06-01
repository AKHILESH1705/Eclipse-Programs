package Exception_handling;// passing an Exception

public class Devide_by_zero {

 public static int divide(int a,int b) throws DivideByZeroException{
	if(b == 0 ) {
		throw new DivideByZeroException();
	}
	 return a/b;
 }
 public static void main(String args[])throws DivideByZeroException {
	 divide(10,0);
 }
}

