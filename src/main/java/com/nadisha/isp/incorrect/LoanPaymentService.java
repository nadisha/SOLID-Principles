package com.nadisha.isp.incorrect;

import java.util.List;

public class LoanPaymentService implements PaymentService {

	@Override
	public void initiatePayments() {
		throw new UnsupportedOperationException("This is not a bank payment");
	}

	@Override
	public Object status() {
		System.out.println("Get loan payment status.");
		return null;
	}

	@Override
	public List<Object> getPayments() {
		System.out.println("Get list of loan payments.");
		return null;
	}

	@Override
	public void intiateLoanSettlement() {
		System.out.println("Settle initial load payment.");		
	}

	@Override
	public void initiateRePayment() {
		System.out.println("Initiate loan re payments.");
		
	}

}
