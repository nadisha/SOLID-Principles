package com.nadisha.lsp.incorrect;

import java.util.List;

public class BankPaymentService implements PaymentService {

	@Override
	public void initiatePayments() {
		System.out.println("Processing Bank initial payment");
	}

	@Override
	public Object status() {
		System.out.println("Get Bank payment status.");
		return null;
	}

	@Override
	public List<Object> getPayments() {
		System.out.println("Get list of bank payments.");
		return null;
	}

	@Override
	public void intiateLoanSettlement() {
		throw new UnsupportedOperationException("This is not a bank payment");
	}

	@Override
	public void initiateRePayment() {
		throw new UnsupportedOperationException("This is not a bank payment");
	}

}
