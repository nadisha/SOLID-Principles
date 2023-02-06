package com.nadisha.srp.incorrect;

public class BankService {
	
	public Boolean deposit(float depositAmount, String accountNumber) {
		System.out.println("Deposit " + depositAmount + " to account number " + accountNumber);
		return Boolean.TRUE;
	}
	
	public Boolean withdraw(float withdrawAmount, String accountNumber) {
		System.out.println("Withdraw " + withdrawAmount + " from account number " + accountNumber);
		return Boolean.TRUE;
	}	
	
	public void printPassbook() {
		System.out.println("Update transaction info in passbook");
	}
	
	public Float getLoanInterestRate(String loanType) {
		if (loanType.equals("home-loan")) {
			return 2.5f;
		}
		
		if (loanType.equals("personal-loan")) {
			return 12.25f;
		}
		
		if (loanType.equals("vehicle-loan")) {
			return 15.50f;
		}
		
		return null;
	}
	
	public void sendOTP(String medium, String to) {
		if (medium.equals("email")) {
			System.out.println("Send email with OTP number to email address " + to);
		}
		
		if (medium.equals("mobile")) {
			System.out.println("Send SMS with OTP number to mobile number " + to);
		}		
	}
}
