import java.util.*;

public class FharenheittoCelcius {
 
	public static void main(String[] args) {
	 
		Scanner s = new Scanner(System.in);
		
		int first = s.nextInt();
		int last = s.nextInt();
		int step = s.nextInt();
	    int celcius=0,fharenheit;
	    String space = "  ";
	    while(first<=last) {
	        fharenheit = first;
	    	celcius = ((fharenheit-32)*5/9);
	        System.out.println(first+space+celcius);
	    	first+=step;
	    	space=" ";
	    }

  }
	 
 
}
