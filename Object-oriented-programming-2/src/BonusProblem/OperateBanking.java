package BonusProblem;

import java.util.Scanner;

public class OperateBanking {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int balance=s.nextInt();
	    double interest=s.nextDouble();
	    BankingSystem sa=new BankingSystem(balance,interest);
		
		int x=s.nextInt();
		while(x!=-1){
		if(x==1)
		{
		    int add=s.nextInt();
		    sa.deposit(add);
		}
		else if(x==2)
		{
		    int with=s.nextInt();
		    sa.withdraw(with);
		}
		else if(x==3)
		    sa.addInterest();
		x=s.nextInt();
		}
		System.out.println(sa.getBalance());
		
	}
}
