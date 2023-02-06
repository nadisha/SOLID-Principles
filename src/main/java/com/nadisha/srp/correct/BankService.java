package com.nadisha.srp.correct;

public class BankService {
	public Boolean deposit(float depositAmount, String accountNumber) {
		System.out.println("Deposit " + depositAmount + " to account number " + accountNumber);
		return Boolean.TRUE;
	}
	
	public Boolean withdraw(float withdrawAmount, String accountNumber) {
		System.out.println("Withdraw " + withdrawAmount + " from account number " + accountNumber);
		return Boolean.TRUE;
	}
}
