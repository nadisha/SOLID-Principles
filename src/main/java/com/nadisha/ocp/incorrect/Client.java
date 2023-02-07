package com.nadisha.ocp.incorrect;

public class Client {

	public static void main(String[] args) {
		NotificationService notificationService = new NotificationService();

		notificationService.sendOTP("email", "jhon.smith@gmail.com");
		
		notificationService.sendOTP("mobile", "(555) 555-1234");
		
		notificationService.sendOTP("whatsapp", "+639459636583");
	}

}
