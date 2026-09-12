package com.shravya;

public class Bank {
	
	static int CurrentBalance=1000;
    public static void greetCustomer()
	{
		System.out.println("Hello, Welcome to the Banking Application");	
	}
    
    public void deposit(int amount)
    {
    	CurrentBalance+=amount;
    	System.out.println("Amount is deposited successfully.");
    }
	
    public static void withdrawal(int amount)
    {
    	if(amount<=CurrentBalance) {
    	CurrentBalance-=amount;
    	System.out.println("Amount is withdrawn successfully.");
    	}
    	else
    	{
    		System.out.println("Insufficient Balance.Unable to withdraw Rs."+amount);
    	}
    }
    
    public int getCurrentBalance()
    {
    	return CurrentBalance;
    }
//	deposit, withdrawal, getCurrentBalance
	public static void main(String[] args)
	{
		Bank bank=new Bank();
		greetCustomer();
		System.out.println("current balance is: "+bank.getCurrentBalance());
		bank.deposit(1500);
		withdrawal(15000);
		System.out.println("current balance is: "+bank.getCurrentBalance());
	}

}
