package application;

import java.util.ArrayList;
import java.util.List;

import account.Account;
import account.BusinessAccount;
import account.SavingAccount;

public class AccountMain {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();

		list.add(new SavingAccount(100, "Alexs", 500.01, 0.01));
		list.add(new BusinessAccount(101, "Santos", 510.01, 0.02));

		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		for (Account acc : list) {
				acc.deposit(10.0);
		}
	}
}
