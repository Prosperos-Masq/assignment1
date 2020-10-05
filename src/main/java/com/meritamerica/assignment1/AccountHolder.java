package com.meritamerica.assignment1;

public class AccountHolder {
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount checkingAccount;
	private SavingsAccount SavingsAccount;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public String toString() {
		return "Name: " + firstName + " " + middleName + " " + lastName +
				"\n" + "SSN: " + ssn +
				"\n" + "Checking Account Balance: " + checkingAccount.getBalance() + 
				"\n" + "Checking Account Interest Rate: " + checkingAccount.getInterestRate() + 
				"\n" + "Checking Account Balance In 3 Years: " + checkingAccount.futureValue(3) +
				"\n" + "Savings Account Balance: " + SavingsAccount.getBalance() + 
				"\n" + "Savings Account Interest Rate: " + SavingsAccount.getInterestRate() + 
				"\n" + "Savings Account Balance In 3 Years: " + SavingsAccount.futureValue(3);
		
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	public SavingsAccount getSavingsAccount() {
		return SavingsAccount;
	}
	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.SavingsAccount = savingsAccount;
	}
	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccount, double savingsAccount) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccount = new CheckingAccount(checkingAccount);
		this.SavingsAccount = new SavingsAccount(savingsAccount);
	}
	
	
	
}