import java.util.Scanner;
public class Pattern18 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int no_of_row=(2*n)+1;
        int n1=((no_of_row)/2)+1;
        int i=1;
        int x=2;
        while(i<=no_of_row){
            int j=1;
            int p=i;
            if(i>n1){
               p=i-x;
                x+=2;
            }
            int no_of_val=(2*p)-1;
            int k=1;
            int z=0;
            while(j<=no_of_val){
                if(j==1 || j==no_of_val){
                    System.out.print("*");
                }else{
                     System.out.print(k);
                    if(k==p-1 || z==1){
                        k--;
                        z=1;
                    }else{
                        k++;
                    }
                }
                j++;
            }
            i++;
            System.out.println();
        }
        
        
    }
}