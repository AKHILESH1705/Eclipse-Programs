import java.util.Scanner;

public class Highest_ocurence {
	public static char highestOccuringChar(String str) {
		 int arr[] = new int[256];
	      int l = str.length();
	      for (int i = 0; i < l; i++){
	         arr[str.charAt(i)]++;
	      }
	   int max = -1;
	   char result = ' ';

	  for (int i = 0; i < l; i++) 
	  {
	      if (max < arr[str.charAt(i)]) 
	      {
	           max = arr[str.charAt(i)];
	           result = str.charAt(i);
	      }
	  }

	  return result;
	 }
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(highestOccuringChar(str));
		
		
	}		

}
