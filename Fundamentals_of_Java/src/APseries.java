import java.util.Scanner;

public class APseries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int j = 0;
		int AP = 0;
		while (j <= n) 
		{    //2
		while (i <=n + j-i / 2) 
		{     //2+0
			AP = 3 * i + 2;
			if (AP % 4 != 0)
				System.out.print(AP + " ");
//			else
//				System.out.print(i);
			i++;
		}
//		System.out.println();
//			System.out.print(j);
			j++;
		}
		
	}

}