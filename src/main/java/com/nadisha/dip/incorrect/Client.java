package com.nadisha.dip.incorrect;

public class Client {

	public static void main(String[] args) {
		DebitCardService service = new DebitCardService();
		
		ShoppingMallService shopping = new ShoppingMallService(service);
		
		shopping.purchase(200.25f);

	}

	/*
	public static void main(String[] args) {
		CreditCardService service = new CreditCardService();
		
		ShoppingMallService shopping = new ShoppingMallService(service);
		
		shopping.purchase(200.25f);

	}
	*/	
}
