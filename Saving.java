package edu.gcu.cst105.BankingApp;

public class Saving extends Account {
	
	double serviceFee = 25.00;
	double annualInterestRate = (.06);
	double minBalance = 25.00;
	
	
	private double getServiceFee() {
		return serviceFee;
		
	}
	private void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}
	private double getAnnualInterestRate() {
		return annualInterestRate;
	}
	private void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	private double getMinBalance() {
		return minBalance;
	}
	private void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	Saving(double balance, String account ){
		this.balance = balance;
		this.account = account;
	}
}
