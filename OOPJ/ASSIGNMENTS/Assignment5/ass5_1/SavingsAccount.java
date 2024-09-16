package com.ass5_1;

public class SavingsAccount extends BankAccount {
	
	@Override
	public void Withdraw() {
		int withdrawAmount;
		System.out.println("Please enter the amount to be withdrawn : ");
		withdrawAmount= sc.nextInt();
		
		super.balance -= withdrawAmount; 
		
		System.out.println("Your total balance is now : "+ super.balance);
		
		
		
		
		
	}
	

}
