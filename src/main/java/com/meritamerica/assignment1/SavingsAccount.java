package com.meritamerica.assignment1;

public class SavingsAccount {
	private double balance = 0;
	private static final double interestRate = 0.01;
	
	public double getBalance() {
		return balance;
	}
	public SavingsAccount(double checking) {
		balance = checking;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public boolean withdraw(double money) {
		if(balance > money) {
			balance -= money;
			System.out.println("You have with drawn " + money + " your current balance is: " + balance);
			return true;
		}
		else {
			System.out.println("You do not have enough money your balance is: " + balance);
			return false;
		}
	}
	public boolean deposit(double money) {
		if(money > 0) {
			balance = money + balance;
			System.out.println(money + " Has been added to your balance");
			return true;
		}
		else {
			System.out.println("This is a negative amount");
			return false;
		}
	}
	public double futureValue(int years) {
		double future = 0;
		future = Math.pow(1 + interestRate, years) * balance;
		return future;
	}
	public String toString() {
		return "Savings Account Balance: " + balance + 
				"\n" + "Savings Account Interest Rate: " + interestRate + 
				"\n" + "Savings Account Balance In 3 Years: " + futureValue(3);
	}
}