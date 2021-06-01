import java.util.Scanner;
public class evenodd {

public static void main(String args[]) {
	
	int  number;
	
	Scanner s  = new Scanner(System.in);
	
	number = s.nextInt();

	
  if(number%2==0) 
	  System.out.print("Number is even = "+number);
  else if(number%1==0) {
	  System.out.print("invalid");
  }
  else 
  {
	  System.out.println("number is odd = "+number);
  }
	
	
}



}
