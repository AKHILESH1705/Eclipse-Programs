import java.util.Scanner;

public class DistributionProblem {
	
	public static void Distribution(int temp[],int m) {
		int k = 0;
		int n  = temp.length;
		int tp[] = new int[n];
		int i = 0,h=0;
				
		while(k<n-2) 
		{
		 int min = 100,max = 0,dif=0;
		 while(i<m) 
		 {
			if(temp[i]<min) 
			{
				min = temp[i];
			}
			else if(temp[i]>max) 
			{
				max = temp[i];
			}
			
			i++;
		}
		dif = max-min;
		tp[h] = dif;
		i=i-2;
		 m=m+1;
		 k=k+1;
		 h++;
		
		}
		int min = 100;
		for(int p= 0;p<n-2;p++) {
			if(tp[p]<min) {
				min = tp[p];
			}
		}
			System.out.println(min);
		    
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[] = new int[num];
		for(int i = 0;i<num;i++) {
			arr[i] = s.nextInt();
		}
		int n = arr.length;
		int temp[] = new int[n];
		for(int i = 0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;	
				}
			}
			temp[i] = arr[i];
		}
		int m = s.nextInt();
		Distribution(temp,m);
	}
}
