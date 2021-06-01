import java.util.Scanner;
public class longest_word {
	
		public static String Small_longest(String str) {
			 str+=' ';
			 int n = str.length();
			 char ch;
			 String longest = " ";
			 String s = ""; 
			 for(int i = 0;i<n;i++)
			 {
				 ch = str.charAt(i);
				 if(ch!=' ') {
					 s=s+ch;
				 }
				 else if(s.length()>longest.length()) { 
						 longest = s;
						 s="";
				 }
			
			 }
			 return longest;
		}
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			String str = s.nextLine(); 
			System.out.println(Small_longest(str));
			
			
		}
	}

