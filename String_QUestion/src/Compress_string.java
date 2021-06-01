import java.util.Scanner;

public class Compress_string {
	public static String highestOccuringChar(String str) {
		 int n = str.length();
		 String result="";
	        for (int i = 0; i < n; i++) {
	            int count = 1;
	            while (i < n - 1 &&  str.charAt(i) == str.charAt(i + 1))
	            {
	                count++;
	                i++;
	            }
	            result+=str.charAt(i);
	            if(count>=2) 
	            {
	             result+=count;
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