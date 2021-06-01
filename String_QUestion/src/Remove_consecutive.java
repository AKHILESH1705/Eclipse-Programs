import java.util.Scanner;
public class Remove_consecutive {
	
 public static String RemoveConsecutive(String str1) {
		String str = "";
	    str +=str1.charAt(0);
	    int a = 0;
		for(int i = 1;i<str1.length()-1;i++) {
			if(str.charAt(a)!=str1.charAt(i)) {
				str+=str1.charAt(i);
				a=a+1;
			}
		
		}
	 return str;

 }
	public static void main(String args[]) {
	
	Scanner s = new Scanner(System.in);
	
	String str1 = s.nextLine();
    
	System.out.println(RemoveConsecutive(str1));
 }
}