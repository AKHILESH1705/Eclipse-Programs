
public class Fact_with_recursion {
	
	public static long fact(int n)
	{
		if(n==0) {
			return 1;
		}
		long small = fact(n-1);
		long out = n*small;
		
		return out;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(fact(25));
	}

}
