package edu.gcu.cst105.BankingApp;

public class  Checking extends Account{
	//this is the Checking Account class
	
	//here is the overdraft fee object for when Major Pane overdrafts to feed his 12 kids
	double overdraft = -45.00;

	//this is the getter (now we all know Major Pane is the getter) but this is what gets the overdraft fee to the overdraft object
	private double getOverdraft(double overdraft) {
		return overdraft;

	}
	//this is the object that sets the overdraft fee
	private void setOverdraft(double overdraft) {
		this.overdraft = -45.00;

	}
	
	public double doOverdraft(double overdraft) {
		if (balance < 0.00) {
		}
		return 45.00;
	}
		//this method tells the computer how to withdraw... but only when MajorPane tells the computer to withdraw
		public double doWithdraw(double Withdraw) {
			return Withdraw;	}
		
		//this is how the account and balance gets displayed
		Checking(double balance, String account ){
			this.balance = balance;
			this.account = account;
		
//			public String toString() {
//				return this.balance + " - " + this.account;
//		}
		}

	
	
}
