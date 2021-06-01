import java.awt.print.Printable;
import java.util.Scanner;
public class simpleinterest {
	
public static void main(String[] args){
	double principle,rate,interest,time;

	
	Scanner s = new Scanner(System.in);
	System.out.println("please enter principle amount =");
	principle = s.nextDouble();
	System.out.println("please enter rate of interest =");
	rate = s.nextDouble();
	System.out.println("please enter amount of time =");
	time = s.nextDouble();
	
	interest = (principle*rate*time)/100;
	
	
	
	
	System.out.println("simple interest after : "+time+" year is = "+interest);
	
	
	
	
}

}
