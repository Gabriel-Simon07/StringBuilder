package application;

import account.Account;
import account.BusinessAccount;
import account.SavingAccount;

public class TestingAnotationOverride {

	public static void main(String[] args) {
//		Account account1 = new Account(1001, "Alex", 1000.0);
//		account1.withdraw(200.0);
//		System.out.println(account1.getBalance());
	
		Account account2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
		account2.withdraw(200.0);
		System.out.println(account2.getBalance());
		
		Account account3 = new BusinessAccount(1003, "João", 1000.0, 500.0);
		account3.withdraw(200.0);
		System.out.println(account3.getBalance());
	}
}
