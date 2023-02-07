package com.nadisha.dip.correct;

public class Client {

	public static void main(String[] args) {
		BankCardService service = new DebitCardService();
		
		ShoppingMallService shopping = new ShoppingMallService(service);
		
		shopping.purchase(200.25f);
	}

}
