package com.nadisha.lsp.incorrect;

public class Client {

	public static void main(String[] args) {
		PaymentService bankPaymentService = new BankPaymentService();
		
		// Bank Payment Operations
		bankPaymentService.getPayments();
		bankPaymentService.status();
		bankPaymentService.initiatePayments();
		
		// Unsupported operations by the bank service
		bankPaymentService.intiateLoanSettlement();
		bankPaymentService.initiateRePayment();
		
		PaymentService loanPaymentService = new LoanPaymentService();
		
		// Unsupported operations by the loan service
		loanPaymentService.getPayments();
		loanPaymentService.status();
		loanPaymentService.initiatePayments();
		
		// Loan Payment Operations
		loanPaymentService.intiateLoanSettlement();
		loanPaymentService.initiateRePayment();
	}

}
