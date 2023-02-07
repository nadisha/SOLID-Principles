package com.nadisha.dip.correct;

public class CreditCardService implements BankCardService {

	@Override
	public void doTransaction(float amount) {
		System.out.println("Payment of " + amount + " has been paid by credit card");
	}

}
