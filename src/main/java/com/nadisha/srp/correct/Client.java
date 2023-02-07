package com.nadisha.srp.correct;

public class Client {

	public static void main(String[] args) {
		BankService bankService = new BankService();
		
		bankService.deposit(2000.00f, "1234-5678-9876-5432");
		bankService.withdraw(5000.00f, "9876-5432-1234-5678");
		
		PrinterService printerService = new PrinterService();
		printerService.printPassbook();
		
		LoanService loanService = new LoanService();
		loanService.getLoanInterestRate("home-loan");
		
		NotificationService notificationService = new NotificationService();
		notificationService.sendOTP("email", "jhon.smith@gmail.com");

	}

}
