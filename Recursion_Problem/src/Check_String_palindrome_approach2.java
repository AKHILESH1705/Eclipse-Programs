import java.util.Scanner;

public class Check_String_palindrome_approach2 {
	
	
	public static boolean checkPalindrom(String input) {
		// Write your code here
        int start = 0;
        int end = input.length()-1;
        return Palindrom(input,start,end);
    
	}
    
    public static boolean Palindrom(String input , int start,int end){ 
           if(start == end)
             {
                return true;
             }
        
             else if(input.charAt(start) != input.charAt(end)){
                   return false;
              }
            if(start<=end)
                return Palindrom(input,start+1,end-1);
          
            return true;
    }

	
	public static void main(String[] aegs) {
		Scanner s  = new Scanner(System.in);
		String S = s.nextLine();
		System.out.println(checkPalindrom(S));
		
	}
}
