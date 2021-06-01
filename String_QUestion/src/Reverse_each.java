import java.util.Scanner;
public class Reverse_each {
	
	public static String reverse_each(String str){
		
		   String reverse = "";
	        int length = str.length();

	        for (int i = length - 1; i >= 0; i--)
	            reverse = reverse + str.charAt(i);
		
		
	return reverse;
	}

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(reverse_each(str));
		
		
		
	}

}
