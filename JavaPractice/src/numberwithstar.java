import java.util.Scanner;

public class numberwithstar {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=n;
            while(j>=1){
               if(j!=i)
               {              
                System.out.print(j);
               }
                else
                {
                System.out.print("*");
                }
        j--;             
        }
        i++;
        System.out.println();
        }
	}
}

/*
 5432*
 543*1
 54*21
 5*321
 *4321
 
 
 */