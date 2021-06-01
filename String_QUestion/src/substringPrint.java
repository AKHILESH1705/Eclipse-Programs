import java.util.Scanner;

public class substringPrint {
		public static void main(String[] args) {
			Scanner s  = new Scanner(System.in);
			String str = s.nextLine();
	        String words[] = str.split("\\s");
			String reversedString = "";
			   for (int i = 0; i < words.length; i++) { 
		            if (i == words.length - 1) 
		                reversedString = words[i] + reversedString; 
		            else
		                reversedString = " " + words[i] + reversedString; 
		        } 
			   System.out.print("Reversed string : " + reversedString);
	}
}