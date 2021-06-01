package BonusProblem;

public class BankingSystem {

	private int balance;
	private double interest;

	public BankingSystem(int initialBalance, double initialInterest)
	{
        this.balance = initialBalance;
        this.interest = initialInterest;
	}

	public void deposit(int amount)
	{
        balance += amount;
	}

	public void withdraw(int amount)
	{
        balance -= amount;
	}

	public void addInterest()
	{ 
   
//        long myLong=(int)interest;
//        interest=(interest%1)*100;
//        int myInt=(int)interest;
//        int intst = (balance * myInt)/100;
//        balance+=intst;
		    int intst = (int)(balance * interest);
            balance+=intst;
   
	}

	public int getBalance()
	{
		return balance;
	}


}
