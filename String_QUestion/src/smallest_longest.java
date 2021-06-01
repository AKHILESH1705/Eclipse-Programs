import java.util.Scanner;

public class smallest_longest {
	public static String Small_longest(String str) {
		 //String s[] = str.split(" ");
		 //String small = s[0];
		 //for(String s1:s)
		  str+=" ";
		  String small = str;
		  String s1 = ""; 
		  for(int i = 0;i<str.length();i++)
		 {
			  char ch = str.charAt(i);
				 if(ch!=' ') {
					 s1=s1+ch;
				 }
				 else {
					 if(s1.length()<small.length()) 
					 {
						 small = s1;
					 }
				  s1="";
			    }
		 }
		 return small;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); 
		System.out.println(Small_longest(str));
		
		
	}
}
