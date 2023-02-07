package com.nadisha.dip.correct;

public class ShoppingMallService {

	/*
	 * Payment by debit card
	 */
	private BankCardService cardService;
	
	public ShoppingMallService(BankCardService cardService) {
		this.cardService = cardService;
	}
		
	public void purchase(float amount) {
		this.cardService.doTransaction(amount);
		System.out.println("Payment is done.");
	}	
}
