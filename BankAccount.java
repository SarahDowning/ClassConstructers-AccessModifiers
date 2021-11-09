package com.qa.helloworld;

public class BankAccount {

	private String account;
	private float balance;
	private int accountNumber;
	private String branchName;

	// constructor fields

	public BankAccount(String account, float balance, int accountNumber, String branchName) {

		this.account = account;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.branchName = branchName;
	}

	// getters
	public String account() {
		return this.account;
	}

	public float getBalance() {
		return this.balance;
	}

	public int getAccountNumber() {
		return this.accountNumber;

	}

	public String getBranchName() {
		return this.branchName;
	}

	// setters

	public void setAccount(String account) {
		this.account = account;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	// non static method
	public void greeting() {
		System.out.println("Hello and welcome to banking with " + branchName + ".");
	}

	// static method
	public static String newBankAccount() {
		return "Your new bank account has been created!";
	}
}
