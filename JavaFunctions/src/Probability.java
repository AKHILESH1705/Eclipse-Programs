import java.util.*;

public class Probability{
	
	public static int ProBabiLity(int num , int x) {
		
		int res = NcR(4,x)*NcR(4,num-x);
		int Prob = res/NcR(8,num);
		return Prob*100;
		
	}
	public static int Fact(int num) {
	    int fact = 1;
	    for(int i =1;i<=num;i++) {
	    	fact = fact*i;
	    }
	    return fact;
	}
	
	public static int NcR(int num, int r) {
		int result = (Fact(num)/Fact(num-r))/Fact(r);
		return result;
	}
	public static void main(String[] args) {
		
		 Scanner s  = new Scanner(System.in);
		 int n = s.nextInt();
		 int x = s.nextInt();
		 int result = Probability.ProBabiLity(n, x);
		 System.out.println(result);
		 
	}
	
}