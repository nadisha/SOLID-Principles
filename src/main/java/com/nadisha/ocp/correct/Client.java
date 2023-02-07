package com.nadisha.ocp.correct;

public class Client {

	public static void main(String[] args) {
		NotificationService emailNotification = new EmailNotificationService();

		NotificationService mobileNotification = new MobileNotificationService();
		
		NotificationService whatsAppNotification = new WhatsAppNotificationService();
		
		emailNotification.sendOTP("jhon.smith@gmail.com");
		mobileNotification.sendOTP("(555) 555-1234");
		whatsAppNotification.sendOTP("+639459636583");
	}

}
