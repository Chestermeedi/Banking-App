 package edu.gcu.cst105.BankingApp;

import java.util.OptionalInt;
import java.util.Scanner;

public class Bank 
{
												

		static Scanner sc = new Scanner(System.in);
		static Bank GCU = new Bank();
		double userInput;
		
		
		public static void main(String [] args) {
			Saving majorSave = new Saving(5000.00, "191923");
			Checking majorCheck = new Checking(5000.00, "991773");
			GCU.displayMenu(majorCheck, majorSave);
			}
		
		
	
			 
		 
	
			
		private void displayMenu(Checking majorCheck, Saving majorSave) {
			int option;
			do {
				System.out.println("============================");
				System.out.println("                          MAIN MENU");
				System.out.println(                           "+ this.name.toUpperCase");
				System.out.println("=============================");
				System.out.println("Pick an option: ");
				System.out.println("---------------------");
			
			
			System.out.println("1: : Deposit to Checking");
			System.out.println("2: : Deposit to Savings");
			System.out.println("3: : Write a Check");
			System.out.println("4: : Withdraw from Savings");
			System.out.println("5: : get Balance");
			System.out.println("6: : Close month (calculate service fee and interest earned)");
			System.out.println("------------------------------------");
			System.out.println("9: : Exit");
			option = sc.nextInt();
			
			GCU.actionMenu(option, majorCheck, majorSave);
			}
			while (option !=9);
			
			{
				System.out.println("Please choose option from 1 - 9");
				
				}
	
		}
		private void actionMenu(int option, Checking majorCheck, Saving majorSave) {
			if (option == 1) {
				displayDepositChecking(majorCheck);
			} 
			else if (option == 2) {
				displayDepositSaving(majorSave);
			}
			else if (option == 3) {
				displayWithdrawChecking(majorCheck);
			}
			else if (option == 4) {
				displayWithdrawSaving(majorSave, majorCheck);
			}
			else if (option == 5) {
				displayGetBalance(majorCheck, majorSave);
			}
			else if (option == 6) {
				displayCloseMonth(majorCheck, majorSave);
			}
		
		
}

		private void displayDepositChecking(Checking majorCheck) {
			System.out.println("how much would you like to deposit?");
			userInput = sc.nextDouble();
			System.out.println("Deposit of " + userInput + " has been made to Checking");
			System.out.println(userInput + majorCheck.balance);

			
			}
			// TODO Auto-generated method stub
			
		
		private void displayDepositSaving(Saving majorSave) {
			System.out.println("how much would you like to deposit?");
			userInput = sc.nextDouble();
			System.out.println("Deposit of " + userInput + " has been made to Saving");
			System.out.println(userInput + majorSave.balance);
			}
			// TODO Auto-generated method stub
	


		private void displayWithdrawChecking(Checking majorCheck) {
			System.out.println("how much would you like to withdraw?");
			userInput = sc.nextDouble();
			System.out.println("Withdraw of " + userInput + " has been made from Checking");
			majorCheck.balance = majorCheck.balance - userInput;
		
			if (majorCheck.balance <= 0.00) {
				majorCheck.balance = majorCheck.balance - majorCheck.doOverdraft(45.00);
			}
			System.out.println(majorCheck.balance);
			
				
				
			
			
			
			}
		
		private void displayWithdrawSaving(Saving majorSave, Checking majorCheck) {
			System.out.println("how much would you like to withdraw?");
			userInput = sc.nextDouble();
			System.out.println("Withdraw of " + userInput + " has been made from Saving");
			System.out.println(majorSave.balance - userInput);
			
			if (majorSave.balance <= 0.00) {
				majorCheck.balance = majorCheck.balance - majorCheck.doOverdraft(45.00);
			}
			System.out.println(majorCheck.balance);
			}
		
		private void displayGetBalance(Checking majorCheck, Saving majorSave) {
			System.out.println("Savings Balance: " + majorSave.balance);
			System.out.println("Checking Balance: " + majorCheck.balance);
			}
		private void displayCloseMonth(Checking majorCheck, Saving majorSave) {
			if (majorCheck.balance <= 200.00) {
				System.out.println(majorCheck.balance + " minus a service fee of $25.00 " + " = " + (majorCheck.balance - majorSave.serviceFee));

			}
			System.out.println((majorSave.balance / 12) * majorSave.annualInterestRate + majorSave.balance);
					
			
			
			
			}
		
}
	// TODO Auto-generated method stub
	



