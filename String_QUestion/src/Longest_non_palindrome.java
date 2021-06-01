import java.util.Scanner;

public class Longest_non_palindrome {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); 
		
		int res = 0;
		for(int i = 0;i<str.length();i++) 
		{
			int ans = 0;
			for(int j = str.length()-1;j>=0;j--) 
			{
				while(i<j) 
				{
				if(str.charAt(i)!=str.charAt(j))
				 {
					ans = (j-i)+1;
					break;
				  }
				j--;
				}
				if(res<ans) {
					res = ans;
				}
			}
			
		}
		System.out.println(res);
		
	}
}
