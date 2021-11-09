package com.qa.helloworld;

public class RunnerBankAccount {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount("Account 1", 1000F, 12345, "NatWest");
		BankAccount account2 = new BankAccount("Account 2", 1250.50F, 54321, "Lloyds");
		System.out.println(account1.getBalance());
		System.out.println(BankAccount.newBankAccount());

		account1.greeting();
		account2.greeting();
		BankAccount.newBankAccount();

	}

}
