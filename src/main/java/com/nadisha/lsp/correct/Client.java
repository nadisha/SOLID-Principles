package com.nadisha.lsp.correct;

public class Client {

	public static void main(String[] args) {
		BankService bankService = new BankPaymentService();
		bankService.initiatePayments();
		bankService.status();
		bankService.getPayments();

		LoanService loanService = new LoanPaymentService();
		loanService.status();
		loanService.getPayments();
		loanService.intiateLoanSettlement();
		loanService.initiateRePayment();
		
	}

}
