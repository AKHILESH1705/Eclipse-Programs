import java.util.Scanner;
public class FuntionFharenheit {

	public static void printFahrenheitTable(int start, int end, int step) {
	    while(start<=end) {
	        int fharenheit = start;
	    	int celcius = ((start-32)*5/9);
	        System.out.println(start+"\t"+celcius);
	    	start+=step;
           
		
	}
}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		printFahrenheitTable(a,b,c);
		
	}
}
