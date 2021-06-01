package BonusProblem;

import java.util.Scanner;

public class Probability_solution {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		Probabilty_problem d=new Probabilty_problem();
		int x=s.nextInt();
		while(x!=-1)
		{
		    if(x==1)
		    {
		        int card=s.nextInt();
		        char suite=s.next().charAt(0);
		        d.remove(card,suite);
		    }
		    else 
		    {
		        int card=s.nextInt();
		        System.out.println(d.probability(card));
		    }
		    x=s.nextInt();
		}
	}
}
