package com.nadisha.dip.incorrect;

public class ShoppingMallService {

	/*
	 * Payment by debit card
	 */
	private DebitCardService debitCardService;
	
	public ShoppingMallService(DebitCardService debitCardService) {
		this.debitCardService = debitCardService;
	}
		
	public void purchase(float amount) {
		this.debitCardService.doTransaction(amount);
		System.out.println("Payment is done by debit card.");
	}

	/*
	 * Payment by credit card
	 */
/*	
	private CreditCardService creditCardService;
	
	public ShoppingMallService(CreditCardService creditCardService) {
		this.creditCardService = creditCardService;
	}	

	
	public void purchase(float amount) {
		this.creditCardService.doTransaction(amount);
		System.out.println("Payment is done by credit card.");
	}
*/	
}
