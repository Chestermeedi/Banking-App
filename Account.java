package edu.gcu.cst105.BankingApp;

import java.io.InputStream;

public abstract class Account 
{
	double balance = 5000.00;
	String account = "Major Pane";	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		balance = balance;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double doWithdraw(double Withdraw) {
		return Withdraw;
		
	}
	
	public double doDeposit(double Deposit) {
		return Deposit;
		
	}
	

}
