import java.util.Scanner;

public class Check_string_isPalindrome {

	public static boolean checkPalindrom(String s) {
		
		if(s.length()<=1) {
			return true;
		}
		if(s.charAt(0)==s.charAt(s.length()-1)){ 
			return checkPalindrom(s.substring(1,s.length()-1));
		}
		else 
		{
		return false;
     	}
}
	
	
	public static void main(String[] aegs) {
		Scanner s  = new Scanner(System.in);
		String S = s.nextLine();
		System.out.println(checkPalindrom(S));
		
	}
}
