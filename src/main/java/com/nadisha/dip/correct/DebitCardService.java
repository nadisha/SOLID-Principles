package com.nadisha.dip.correct;

public class DebitCardService implements BankCardService {

	@Override
	public void doTransaction(float amount) {
		System.out.println("Payment of " + amount + " has been paid by debit card");
	}

}
