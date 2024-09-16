/*1)	Create a base class BankAccount with methods like deposit() and withdraw(). 
 * Derive a class SavingsAccount that overrides the withdraw() method to impose a 
 * limit on the withdrawal amount. Write a program that demonstrates the use of
 *  overridden methods and proper access modifiers & return the details.
 */
package com.ass5_1;

import java.util.Scanner;



public class BankAccount {
	
	protected Scanner sc = new Scanner(System.in);
	
	//private static int amount;
	protected int balance;
	
	public BankAccount() {
				
	}
	

	public void Withdraw() {
		

	}
	
		
	public void Deposit(){
		// TODO Auto-generated method stub
		int amount;
		System.out.println("Please enter the deposit amount : ");
		amount = sc.nextInt();
		this.balance += amount;
	}
	
	
	public void ShowBalance() {
		System.out.println("Your total balance is : " + this.balance);
	}
	
	
	
	public void ReleaseResource() {
		sc.close();
	}

	public static void main(String[] args) {

	}
	

}
