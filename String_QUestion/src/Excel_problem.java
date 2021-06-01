
public class Excel_problem {

	public static void main(String args[]) {
		int n = 23;
		String str = "";
		while(n>0) {
			int c = 'A' + (n-1)%26;
			str = (char)c + str;
			n = (n-1)/26; 
		}
		
		System.out.println(str);
	}
}
