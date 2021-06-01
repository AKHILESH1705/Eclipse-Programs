
public class String_recursion {
	
	/*public static String replaceChar(String s) {
		if(s.length()==0) {
			return s;
		}
		String smalloutput = replaceChar(s.substring(1));
		System.out.println(smalloutput);
		
		
		return s;
	}*/
	public static void main(String args[]) {
		//System.out.println(replaceChar("axbxcxdx"));
		String s = "aabc";
		String Ss = "aabc";
		if(s.charAt(0)==s.charAt(1)) {
			System.out.println(s.charAt(1));
		}
	}
}
