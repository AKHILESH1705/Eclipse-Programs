
public class power_cal_withextra_time {
	// not optimized solution of power calculation O(b)
	
	 public static int Powerrecursive(int a, int b) {
		 if(b <= 1)
		 {
			 return a;
		 }
		  return a*Powerrecursive(a,b-1);
	 }
		
	 public static void main(String args[]) {
		 System.out.println(Powerrecursive(5,3));
	 }
		
	}


