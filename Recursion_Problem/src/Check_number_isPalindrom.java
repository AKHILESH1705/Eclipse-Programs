
public class Check_number_isPalindrom {

	public static int checknumPalindrom(int num,int sum) {
		if(num!=0)
		    {
		    int r=num%10;
		    sum+=(sum*10)+r;
		    num/=10;	
		    checknumPalindrom(num,sum); 
		   
		   }
		return sum;
}
	public static void main(String args[]) {
		
		System.out.println(checknumPalindrom(12321,0));
	}
	
	
}
