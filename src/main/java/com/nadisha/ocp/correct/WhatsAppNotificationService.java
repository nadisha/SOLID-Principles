package com.nadisha.ocp.correct;

public class WhatsAppNotificationService implements NotificationService {

	@Override
	public void sendOTP(String to) {
		System.out.println("Send WhatsApp message with OTP number to WhatsApp number " + to);
	}

}
