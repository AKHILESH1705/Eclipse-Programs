import java.util.Scanner;
public class MaximumafterDigitRemove {
    
    public static int max_number(int n){
            int i = 1;                        
            int res = 0;
            while(n/i > 0){
                int temp = (n/(i*10))*i+(n%i);
                i=i*10;
                if(res<temp){
                    res=temp;
                }
            }
        return res;
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(max_number(n));
	}
    

}

/*
if we remove one digit and check which number is greatest
5348
548
*/