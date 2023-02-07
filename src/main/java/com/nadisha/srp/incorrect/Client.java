package com.nadisha.srp.incorrect;

public class Client {

	public static void main(String[] args) {
		BankService bankService = new BankService();
		
		// Money deposit and withdraw
		bankService.deposit(2000.00f, "1234-5678-9876-5432");
		bankService.withdraw(5000.00f, "9876-5432-1234-5678");
		
		// Printing a passbook
		bankService.printPassbook();
		
		// Get loan interest rates
		bankService.getLoanInterestRate("home-loan");
		
		// Send OTP code
		bankService.sendOTP("email", "jhon.smith@gmail.com");
	}

}
