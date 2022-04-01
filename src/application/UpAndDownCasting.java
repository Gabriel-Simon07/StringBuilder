package application;

import account.Account;
import account.BusinessAccount;
import account.SavingAccount;

public class UpAndDownCasting {

	public static void main(String[] args) {
		Account account = new Account(1001, "Alex", 0.0);
		BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		Account account2 = businessAccount;
		Account account3 = new SavingAccount(1002, "Anna", 0.0, 0.01); 
	
//		BusinessAccount bs = (BusinessAccount) account3;
//		bs.loan(100.0);
//	
		if(account3 instanceof BusinessAccount) {
			BusinessAccount bc2 = (BusinessAccount) account3;
			bc2.loan(20);
			System.out.println("Loan!");
		}
		
		if(account3 instanceof SavingAccount) {
			SavingAccount sa = (SavingAccount) account3;
			sa.updateBalance();
			System.out.println("Update!");
		}
	}

}
