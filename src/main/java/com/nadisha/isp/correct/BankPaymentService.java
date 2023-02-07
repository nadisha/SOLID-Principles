package com.nadisha.isp.correct;

import java.util.List;

public class BankPaymentService implements BankService {

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

}
