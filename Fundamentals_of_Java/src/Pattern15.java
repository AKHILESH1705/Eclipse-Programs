import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 1;
        int maxOdd = (2*(num-1)+1);
        int sum = 0;
        while(i<=num){
            int j =1;
            int odd=1;
            odd=odd+sum;
            while(j<=num){
                
                if(odd>maxOdd){
                     odd=1;
                }
                System.out.print(odd);
                odd=odd+2;
                j=j+1;
               
            }
            System.out.println();
            i=i+1;
            sum= sum+2;
            
        }
    
    }
}